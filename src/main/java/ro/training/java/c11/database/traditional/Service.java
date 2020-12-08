package ro.training.java.c11.database.traditional;

import ro.training.java.c11.database.Dao;
import ro.training.java.c11.database.ProductionDao;
import ro.training.java.c11.model.Student;

public class Service {

    private Dao dao = new ProductionDao();

    public Student createStudent(String lastname, String firstname) {
        return dao.createStudent(lastname, firstname);
    }
}
