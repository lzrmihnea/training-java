package ro.training.java.c11.service;

import ro.training.java.c11.model.Student;

// Creates students, among other things
public class StudentRepositoryOracleImpl implements StudentRepository {

    @Override
    public Student createStudent(String lastName, String firstname) {
        System.out.println("\nYou are now running Oracle in Production!");
        Student newStudent = new Student();
        newStudent.setLastName(lastName);
        newStudent.setFirstName(firstname);
        return newStudent;
    }
}
