package ro.training.java.c08._03try_catch_finally;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Beginning of try");
            //throw new RuntimeException();
            //return;
            printSomething();
            System.out.println("End of try");
        } catch(RuntimeException e) {
            System.out.println("Inside catch");
        } finally {
            System.out.println("Inside finally");
        }

    }
    static void printSomething() {
        throw new RuntimeException();
    }
}
