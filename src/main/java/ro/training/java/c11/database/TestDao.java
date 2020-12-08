package ro.training.java.c11.database;

import ro.training.java.c11.model.Student;

public class TestDao implements Dao {
    @Override
    public Student createStudent(String lastname, String firstname) {
        return new Student();
    }
}
