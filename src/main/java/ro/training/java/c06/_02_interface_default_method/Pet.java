package ro.training.java.c06._02_interface_default_method;

public interface Pet {

    default void bark() { // already implemented
        System.out.println("ham ham");
    }

    void eat(); // abstract, will need to be implemented
}
