package ro.training.java.c06._05_immutable;

import java.util.ArrayList;

public class ImmutableStudentReportCardDemo {

    public static void main(String[] args) {
        ArrayList<Integer> noteleLuiPetrica = new ArrayList<>();
        noteleLuiPetrica.add(9);
        noteleLuiPetrica.add(10);
        noteleLuiPetrica.add(5);

        ImmutableStudentReportCard card1 = new ImmutableStudentReportCard("Petrica", noteleLuiPetrica);
        System.out.println(card1);

        card1.getGrades().remove(0); // we not call this on a separate copy of Petrica's grades. Not the exact grades.
        System.out.println(card1); // It seems like the list of grades is not immutable
    }
}
