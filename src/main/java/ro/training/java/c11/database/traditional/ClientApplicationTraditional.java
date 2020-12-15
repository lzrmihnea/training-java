package ro.training.java.c11.database.traditional;

public class ClientApplicationTraditional {
    public static void main(String[] args) {
        TraditionalService service = new TraditionalService();

        System.out.println(service.createNewStudent("Popsa", "Diana"));
    }
}
