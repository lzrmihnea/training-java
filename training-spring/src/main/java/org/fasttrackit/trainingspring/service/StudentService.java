package org.fasttrackit.trainingspring.service;

import org.fasttrackit.trainingspring.model.Student;

import java.util.List;

public interface StudentService  {
    Student getStudentById(Long studentId);
    Student createNewStudent(Student request);
    Student updateStudent(Student req);
    List<Student> findAllStudents();
    void deleteStudentById(Long id);
    Student findStudentBy(String firstname);
    void renameAllStudents(List<Long> studentIds, String newFirstname);
    List<Student> findStudentsBy(String lastname, String firstname);
}
