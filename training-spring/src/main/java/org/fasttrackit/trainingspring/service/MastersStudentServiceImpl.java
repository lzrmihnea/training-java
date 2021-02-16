package org.fasttrackit.trainingspring.service;

import org.fasttrackit.trainingspring.model.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("mastersStudentService")
public class MastersStudentServiceImpl implements StudentService {
    @Override
    public Student getStudentById(Long studentId) {
        return null;
    }

    @Override
    public Student createNewStudent(Student request) {
        return null;
    }

    @Override
    public Student updateStudent(Student req) {
        return null;
    }

    @Override
    public List<Student> findAllStudents() {
        return null;
    }

    @Override
    public void deleteStudentById(Long id) {

    }

    @Override
    public Student findStudentBy(String firstname) {
        return null;
    }

    @Override
    public void renameAllStudents(List<Long> studentIds, String newFirstname) {

    }

    @Override
    public List<Student> findStudentsBy(String lastname, String firstname) {
        return null;
    }
}
