package ro.training.java.c11.database.ioc;

import ro.training.java.c11.database.Dao;

public class TestIoc {
    public static void main(String[] args) {
        Dao daoToInject =
                new Dao("test-db.google.com:8765", "test-user", "test-password");
        IocService service = new IocService(daoToInject);

        System.out.println(service.createStudent("Baraian", "Samuel"));
    }
}
