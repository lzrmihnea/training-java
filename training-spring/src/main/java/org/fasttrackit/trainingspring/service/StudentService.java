package org.fasttrackit.trainingspring.service;

import org.fasttrackit.trainingspring.model.Student;
import org.fasttrackit.trainingspring.model.entity.StudentEntity;
import org.fasttrackit.trainingspring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class StudentService {

    @Value("${server.port}") // SpEL (Spring Expression Language)
    private String serverPort;

    private final StudentRepository repository;

    public StudentService(StudentRepository injectedRepository) {
        this.repository = injectedRepository;
    }

    @PostConstruct
    public void maiZiCeva() {
        System.out.println("s-a construit bean-ul");
    }

    public Student createNewStudent(Student request) {
        StudentEntity newStudent1 = new StudentEntity();
        newStudent1.setLastname(request.getLastname());
        newStudent1.setFirstname(request.getFirstname());
        newStudent1.setDateOfBirth(request.getDateOfBirth());

        StudentEntity savedEntity = this.repository.save(newStudent1);

        Student responseObject = new Student();
        responseObject.setId(savedEntity.getId());
        responseObject.setFirstname(savedEntity.getFirstname());
        responseObject.setLastname(savedEntity.getLastname());
        responseObject.setDateOfBirth(savedEntity.getDateOfBirth());
        return responseObject;
    }

}
