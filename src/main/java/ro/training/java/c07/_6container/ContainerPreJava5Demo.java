package ro.training.java.c07._6container;

import ro.training.java.c07.model.Student;
import ro.training.java.c07.model.Professor;

public class ContainerPreJava5Demo {

    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.setName("Tudor");
        prof1.setDegree("Assistent");

        Student student1 = new Student();
        student1.setFirstName("Stefan");
        student1.setLastName("Banica jr.");

        Container professorContainer = new Container();
        professorContainer.setInnerObj(student1); // wrong
        //professorContainer.setInnerObj(prof1); // ok

        // This will fail with a class cast exception
        Professor innerProfessor = (Professor) professorContainer.getInnerObj();
        System.out.println("Professor's name is: " + innerProfessor.getName());

    }
}
