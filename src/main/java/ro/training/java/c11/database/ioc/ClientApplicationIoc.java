package ro.training.java.c11.database.ioc;

import ro.training.java.c11.database.Dao;

public class ClientApplicationIoc {
    public static void main(String[] args) {
        Dao daoToInject =
                new Dao("product-db.google.com:8765", "prod-user", "prod-password-123#");
        IocService service = new IocService(daoToInject);

        System.out.println(service.createStudent("Miron", "Cristi"));
    }
}
