package ro.training.java.c11.database;

import ro.training.java.c11.model.Student;

import java.util.logging.Logger;

public class Dao { // DAO = Data Access Repository (synonym with Repository)
    private static final Logger LOG = Logger.getLogger(Dao.class.getSimpleName());

    private String databaseName;
    private String databaseUser;
    private String databasePassword;

    public Dao(String dbName, String dbUser, String dbPw) {
        this.databaseName = dbName;
        this.databaseUser = dbUser;
        this.databasePassword = dbPw;
    }

    public Student createStudent(String lastname, String firstname, int avgGrade) {
        System.out.println("We will now open a connection to database " + databaseName + " for user " + databaseUser);

        Student createdStudent = new Student();
        createdStudent.setLastName(lastname);
        createdStudent.setFirstName(firstname);
        createdStudent.setAverageGrade(avgGrade);
        return createdStudent;
    }
}
