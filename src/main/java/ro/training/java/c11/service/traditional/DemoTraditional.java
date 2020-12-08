package ro.training.java.c11.service.traditional;

public class DemoTraditional {
    public static void main(String[] args) {
        UniversityTraditionalService uniService = new UniversityTraditionalService();
        // Always will have an Oracle Repository inside!

        System.out.println(uniService.createStudent("lazar", "mihnea"));
    }
}
