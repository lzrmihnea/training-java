package ro.training.java.c11.database;


import ro.training.java.c11.model.Student;

public class ProductionDao implements Dao {
    @Override
    public Student createStudent(String lastname, String firstname) {
        // works only in production
        return new Student();
    }
}
