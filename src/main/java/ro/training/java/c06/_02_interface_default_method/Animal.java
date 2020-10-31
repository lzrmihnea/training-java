package ro.training.java.c06._02_interface_default_method;

public interface Animal {

    default void bark() {
        System.out.println("ham din nou");
    }

}
