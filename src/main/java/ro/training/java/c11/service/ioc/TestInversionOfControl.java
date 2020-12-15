package ro.training.java.c11.service.ioc;

import ro.training.java.c11.service.StudentRepository;
import ro.training.java.c11.service.StudentRepositoryTestImpl;

public class TestInversionOfControl {
    public static void main(String[] args) {
        StudentRepository testRepository = new StudentRepositoryTestImpl();
        UniversityIocService service = new UniversityIocService(testRepository);

        System.out.println(service.createStudent("Lakatos", "Marton"));
    }
}
