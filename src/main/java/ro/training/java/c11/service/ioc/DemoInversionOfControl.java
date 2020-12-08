package ro.training.java.c11.service.ioc;

import ro.training.java.c11.service.StudentRepository;
import ro.training.java.c11.service.StudentRepositoryOracleImpl;
import ro.training.java.c11.service.StudentRepositoryPostgresImpl;

public class DemoInversionOfControl {
    public static void main(String[] args) {
        StudentRepository oracleRepository = new StudentRepositoryOracleImpl(); // Pasul 1.1
        StudentRepository postgresRepository = new StudentRepositoryPostgresImpl(); // Pasul 1.2
        // I can now control from outside the Service, which repository is injected

        UniversityIocService universityIocService = new UniversityIocService(oracleRepository); // Pasul 2
        System.out.println(universityIocService.createStudent("Cristi", "Miron"));

        universityIocService.setStudentRepository(postgresRepository);
        System.out.println(universityIocService.createStudent("Ioana", "Rosca"));
    }
}
