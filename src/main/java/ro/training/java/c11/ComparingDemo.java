package ro.training.java.c11;

import ro.training.java.c11.model.Student;
import ro.training.java.c11.model.StudentByAvgGradeComparator;
import java.util.TreeSet;

public class ComparingDemo {
  public static void main(String[] args) {
    TreeSet<Student> someSet =
            new TreeSet(new StudentByAvgGradeComparator());

    Student ana = new Student();
    ana.setLastName("Blandiana");
    ana.setFirstName("Ana");
    ana.setAverageGrade(8);

    // If the Student class does not implement the
    //  Comparable interface, this will throw an Exception
    someSet.add(ana);
  }
}
