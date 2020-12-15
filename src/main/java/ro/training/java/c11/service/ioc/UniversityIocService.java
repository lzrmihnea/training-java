package ro.training.java.c11.service.ioc;

import ro.training.java.c11.model.Student;
import ro.training.java.c11.service.StudentRepository;

public class UniversityIocService {

    private StudentRepository studentRepository;

    // The dependency of the `studentRepository` was injected via the constructor
    // This method of reversion the Control of the Dependency Injection is what
    // is known as Inversion of Control
    public UniversityIocService(StudentRepository dependencyInjectedRepository) { // One method of injecting the repository
        this.studentRepository = dependencyInjectedRepository;
    }

    public Student createStudent(String lastName, String firstName) {
        return studentRepository.createStudent(lastName, firstName);
    }

    public void setStudentRepository(StudentRepository studentRepository) { // Another method of injecting the repository
        this.studentRepository = studentRepository;
    }
}
