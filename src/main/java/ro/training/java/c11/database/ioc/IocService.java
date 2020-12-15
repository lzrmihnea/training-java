package ro.training.java.c11.database.ioc;

import ro.training.java.c11.database.Dao;
import ro.training.java.c11.model.Student;

public class IocService {
    private Dao dao;

    public IocService(Dao injectedDao) { // Injection via Constructor
        this.dao = injectedDao;
    }

    public void setDao(Dao injectedDao) { // Injection via Setter
        this.dao = injectedDao;
    }

    public Student createStudent(String lastname, String firstname) {
        return dao.createStudent(lastname, firstname, (int) Math.random() * 10);
    }
}
