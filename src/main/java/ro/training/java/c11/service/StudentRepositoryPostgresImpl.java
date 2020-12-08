package ro.training.java.c11.service;

import ro.training.java.c11.model.Student;

public class StudentRepositoryPostgresImpl implements StudentRepository {
    @Override
    public Student createStudent(String lastName, String firstname) {
        System.out.println("\nYou are now running on PostgreSQL");
        Student newStudent = new Student();
        newStudent.setLastName(lastName);
        newStudent.setFirstName(firstname);
        return newStudent;
    }
}
