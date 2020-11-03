package ro.training.java.c07._6container;

import ro.training.java.c07.model.Professor;
import ro.training.java.c07.model.Student;

public class ContainerPostJava5Demo {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.setName("Isoscel");
        prof1.setDegree("PhD");

        Student s1 = new Student();
        s1.setFirstName("Alin");
        s1.setLastName("Alin din nou");

        GenericContainer<Professor> professorContainer = new GenericContainer<>();
//        professorContainer.setInnerObj(s1); // does not work, and this is good
        professorContainer.setInnerObj(prof1);

        Professor innerProf = professorContainer.getInnerObj();
        System.out.println(innerProf.getName() + " " + innerProf.getDegree());

        //GenericContainer<Number> numberContainer = new GenericContainer<Number>(); // Number does not implement Human
    }
}
