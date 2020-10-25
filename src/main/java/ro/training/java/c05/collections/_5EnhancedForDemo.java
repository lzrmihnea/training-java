package ro.training.java.c05.collections;

import ro.training.java.c05.model._1basic.Cat;

import java.util.ArrayList;

public class _5EnhancedForDemo {
    public static void main(String[] args) {
        ArrayList<Cat> catList = new ArrayList<>();

        Cat garfield = new Cat();
        garfield.setName("Garfield");
        garfield.setColor("Orange");
        catList.add(garfield);

        Cat tom = new Cat();
        tom.setName("Thomas");
        tom.setColor("Blue");
        catList.add(tom);


        Cat felix = new Cat();
        felix.setName("Felix");
        felix.setColor("Yellow");
        catList.add(felix);

        // Printam lista de Cats pentru a verifica obiectele
        System.out.println("\n Printare intreaga lista: ");
        System.out.println(catList);
        System.out.println("\n Printare a fiecarui element cu `enhanced for`: ");

        for (Cat individualCat : catList) {
            System.out.println(individualCat);
        }
    }
}
