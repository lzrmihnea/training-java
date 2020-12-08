package ro.training.java.c11.database.ioc;

import ro.training.java.c11.database.Dao;
import ro.training.java.c11.model.Student;

public class Service {

    private Dao dao;

    public Service(Dao injectedDao) {
        this.dao = injectedDao;
    }

    public Student createStudent(String lastname, String firstname) {
        return dao.createStudent(lastname, firstname);
    }
}
