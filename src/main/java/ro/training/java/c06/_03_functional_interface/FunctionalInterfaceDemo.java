package ro.training.java.c06._03_functional_interface;

import ro.training.java.c06.model.Cat;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Cat garfield = new Cat();
        garfield.setName("Garfield");
        garfield.setColor("orange");

        Cat tom = new Cat();
        tom.setName("Tom");
        tom.setColor("Blue");

        FuncIntSomething setCatColorToPink = myCat -> myCat.setColor("PINK");
        FuncIntSomething setCatNameToLuna = thisCat -> thisCat.setName("Luna");

        wePrintAndWe(garfield, setCatColorToPink);
        wePrintAndWe(garfield, setCatNameToLuna);
        wePrintAndWe(tom, setCatColorToPink);
    }

    public static void wePrintAndWe(Cat aCat, // we pass an object
                                    FuncIntSomething anotherAction) { // we pass a behavior
        System.out.println();
        System.out.println("Before: " + aCat);

        // When defining the method,
        // we do not know what will happen here.
        anotherAction.doSomething(aCat);

        System.out.println("After: " + aCat);
    }
}
