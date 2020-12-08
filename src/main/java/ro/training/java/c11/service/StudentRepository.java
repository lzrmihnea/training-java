package ro.training.java.c11.service;

import ro.training.java.c11.model.Student;

public interface StudentRepository {

    Student createStudent(String lastName, String firstname);

}
