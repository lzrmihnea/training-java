package ro.training.java.c08;

public class Finally {
    public static void main(String[] args) {
        try {
            something();
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        } catch (Error e) {
            System.out.println("catch error");
        } finally {
            System.out.println("finally");
        }
    }

    public static void something() {
        throw new RuntimeException();
    }
}
