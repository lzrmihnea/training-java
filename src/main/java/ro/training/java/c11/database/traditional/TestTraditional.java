package ro.training.java.c11.database.traditional;

public class TestTraditional {
    public static void main(String[] args) {
        TraditionalService service = new TraditionalService();

        System.out.println(service.createNewStudent("Panaite", "Cosmin"));
    }
}
