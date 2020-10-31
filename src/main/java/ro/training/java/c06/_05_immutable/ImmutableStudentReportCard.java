package ro.training.java.c06._05_immutable;

import java.util.ArrayList;
import java.util.List;

// How do we make this immutable?
class ImmutableStudentReportCard {
    final String name; // Implicitly Immutable
    final List<Integer> grades; // NOT Implicitly Immutable => we have to safeguard

    /**
     * Because it cannot change states, this class is immutable
     * We only set the name and grades once, in the constructor
     * We do not have setters.
      */
    ImmutableStudentReportCard(String studentName, List<Integer> studentGrades) {
        this.name = studentName;
        this.grades = studentGrades;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return new ArrayList(grades);
    } // Now it is immutable, it returns a copy of the grades, not the exact grades

    @Override
    public String toString() {
        return "ImmutableStudentReportCard{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
