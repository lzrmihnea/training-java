package ro.training.java.c11.database;

import ro.training.java.c11.model.Student;

// DAO = Data Access Object (An object that communicates to the database)
public interface Dao {
    // Database connection that works only in VPN
    Student createStudent(String lastname, String firstname);
}
