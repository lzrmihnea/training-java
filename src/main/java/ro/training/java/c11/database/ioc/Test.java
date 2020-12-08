package ro.training.java.c11.database.ioc;

import ro.training.java.c11.database.TestDao;

public class Test {
    Service testService = new Service(new TestDao());
    // We are no longer using a Production DB connection for out tests!

    public void testCreateStudent() {
        System.out.println(testService.createStudent("Popsa", "Diana"));
        // At least we're using a Test Database now!
    }

}
