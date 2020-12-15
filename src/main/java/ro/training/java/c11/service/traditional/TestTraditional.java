package ro.training.java.c11.service.traditional;

public class TestTraditional {
    public static void main(String[] args) {
        UniversityTraditionalService service
                = new UniversityTraditionalService(); //repository created already

        // FIXME we are running tests on Production database
        System.out.println(service.createStudent("Chiorean", "Mihai"));
    }
}
