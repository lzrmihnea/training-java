package ro.training.java.c08._03try_catch_finally;

public class TryFinally {
    public static void main(String[] args) {
//        try {
//            System.out.println("We can't have just a try block");
//        }

        // 1. try + catch
        try {
            System.out.println("try + catch is accepted");
        } catch(Exception e) {
            System.out.println("won't reach here");
        }

        // 2. try + finally
        try {
            System.out.println("try + finally is accepted");
        } finally {
            System.out.println("will always reach here");
        }

        // 3. try + catch + finally
        try {
            System.out.println("try + catch + finally is accepted");
        } catch (Exception e) {
            System.out.println("won't reach here in this case");
        } finally {
            System.out.println("will always reach here");
        }

        // catch + finally is invalid
//        catch (Exception e) {
//
//        } finally {
//
//        }
    }
}
