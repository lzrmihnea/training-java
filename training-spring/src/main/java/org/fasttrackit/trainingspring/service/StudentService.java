package org.fasttrackit.trainingspring.service;

import org.fasttrackit.trainingspring.model.Student;
import org.fasttrackit.trainingspring.model.entity.StudentEntity;
import org.fasttrackit.trainingspring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Value("${server.port}") // SpEL (Spring Expression Language)
    private String serverPort;

    private final StudentRepository repository;

    private final EntityManager entityManager;

    public StudentService(StudentRepository injectedRepository,
                          EntityManager entityManager) {
        this.repository = injectedRepository;
        this.entityManager = entityManager;
    }


    public Student getStudentById(Long studentId) {
        //pre java8 => `repository.findById(studentId)` COULD RETURN A NULL, so you always had to check for that
        //after java8 => `repository.findById(studentId)` ALWAYS RETURNED OPTIONAL, which was never null, so you could always call methods directly on it => easier to use
        Optional<StudentEntity> foundEntity = repository.findById(studentId);

        // v1
        if (foundEntity.isPresent()) { // easier than `if(foundEntity != null)`
            StudentEntity entity = foundEntity.get();
            Student response = mapEntityToStudentResponse(entity);
            // return response
        }

        // v2
        if (!foundEntity.isPresent()) {
            return null;
        }
        return foundEntity
                .map(entityToMap -> mapEntityToStudentResponse(entityToMap))
                .get();
    }

    public Student createNewStudent(Student request) {
        StudentEntity newStudent1 = new StudentEntity();
        newStudent1.setLastname(request.getLastname());
        newStudent1.setFirstname(request.getFirstname());
        newStudent1.setDateOfBirth(request.getDateOfBirth());

        StudentEntity savedEntity = this.repository.save(newStudent1);

        return mapEntityToStudentResponse(savedEntity);
    }

    public Student updateStudent(Student req) {
        StudentEntity entityToUpdate = new StudentEntity();
        entityToUpdate.setId(req.getId()); // ! here is the diff between UPDATE and SAVE
        entityToUpdate.setLastname(req.getLastname());
        entityToUpdate.setFirstname(req.getFirstname());
        entityToUpdate.setDateOfBirth(req.getDateOfBirth());

        StudentEntity updatedEntity = this.repository.save(entityToUpdate);

        return mapEntityToStudentResponse(updatedEntity);
    }

    public List<Student> findAllStudents() {

        //v1: pre-java8
        List<StudentEntity> allEntities = this.repository.findAll();

        List<Student> responseList = new ArrayList<>();
        for (StudentEntity entity : allEntities) {
            responseList.add(mapEntityToStudentResponse(entity));
        }
        //return responseList;


        //v2 post-java8
        return this.repository.findAll()
                .stream()
                .map(entity -> mapEntityToStudentResponse(entity))
                .collect(Collectors.toList());
    }

    public void deleteStudentById(Long id) {
        this.repository.deleteById(id);
    }

    public Student findStudentBy(String firstname) {
        return this.repository.findStudentByFirstName(firstname)
                .map(entity -> mapEntityToStudentResponse(entity))
                .get();
    }

    @Transactional
    public void renameAllStudents(List<Long> studentIds, String newFirstname) {
        List<StudentEntity> allById = this.repository.findAllByIdIn(studentIds);

        allById.forEach(student ->
        {
            double randomNumber = Math.random() * 10;
            if(randomNumber>5) {
                throw new RuntimeException("n-am chef");
            }

            student.setFirstname(newFirstname);
            this.repository.save(student);
        });
    }

    public List<Student> findStudentsBy(String lastname, String firstname) {
        return this.repository.findStudentEntitiesByFirstnameEqualsOrLastnameEquals(firstname, lastname)
                .stream()
                .map(entity -> mapEntityToStudentResponse(entity))
                .collect(Collectors.toList());
    }

    private Student mapEntityToStudentResponse(StudentEntity entity) {
        Student response = new Student();
        response.setId(entity.getId());
        response.setFirstname(entity.getFirstname());
        response.setLastname(entity.getLastname());
        response.setDateOfBirth(entity.getDateOfBirth());
        return response;
    }

    private EntityManager em() {
        return entityManager;
    }

}
