package ro.training.java.c11.database.traditional;

public class Test {
    Service testService = new Service(); // we're forced to use a Production DAO

    public void testCreateStudent() {
        System.out.println(testService.createStudent("Lakatos", "Marton"));
        // FIXME big problem! We are calling a Service which is calling a Production DAO!
    }
}
