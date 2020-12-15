package ro.training.java.c11.database.traditional;

import ro.training.java.c11.database.Dao;
import ro.training.java.c11.model.Student;

public class TraditionalService {
    private Dao dao = new Dao("db-name", "db-user", "db-pw");

    public Student createNewStudent(String lastname, String firstname) {
        return dao.createStudent(lastname, firstname, (int) (Math.random()*10));
    }
}
