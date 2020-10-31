package ro.training.java.c06._02_interface_default_method;

public class Dog implements Pet, Animal {
    @Override
    public void bark() {
        System.out.println("dog make ham");
    }

    @Override
    public void eat() {
        System.out.println("Yum yum");
    }
}
