package ro.training.java.c11.service.traditional;

import ro.training.java.c11.model.Student;
import ro.training.java.c11.service.StudentRepository;
import ro.training.java.c11.service.StudentRepositoryOracleImpl;

// Handles many operations on Students, Professors, Grades
// Has to split code into Repositories (StudentRepository, other...)
public class UniversityTraditionalService {
    // left of equals we have the interface, which is good for IoC
    // right of equals we create the exact repository
    private StudentRepository studentRepository = new StudentRepositoryOracleImpl();  // FIXME bad design for dependencies!
    // if I want to change the implementation that is assigned to the student repository, I have to change this code. Not OK.

    public Student createStudent(String lastName, String firstName) {
        return studentRepository.createStudent(lastName, firstName);
    }

}
