package ro.training.java.c11.service;

import ro.training.java.c11.model.Student;

public class StudentRepositoryTestImpl implements StudentRepository {
    @Override
    public Student createStudent(String lastName, String firstname) {
        System.out.println("\n You are now running on a Test database");
        Student testStudent = new Student();
        testStudent.setLastName(lastName);
        testStudent.setFirstName(firstname);
        return testStudent;
    }
}
