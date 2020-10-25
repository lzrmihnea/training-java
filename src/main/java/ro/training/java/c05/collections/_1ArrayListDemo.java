package ro.training.java.c05.collections;

import ro.training.java.c05.model._1basic.Cat;

import java.util.ArrayList;

public class _1ArrayListDemo {
    public static void main(String[] args) {
        // Cream o noua lista
        ArrayList<Cat> cats = new ArrayList<>();

        // Cream un object nou de tip Cat si il
        // atribuim la o variabila numita "garfield"
        Cat garfield = new Cat();
        garfield.setName("Garfield");
        garfield.setColor("Orange");

        // Adaugam variabila 'garfield' in lista 'cats'
        cats.add(garfield);

        // Cream alt object de tip Cat si il
        // atribuim la o variabila numita "tom"
        Cat tom = new Cat();
        tom.setName("Thomas");
        tom.setColor("Blue");

        // Adaugam variabila 'tom' in lista 'cats'
        cats.add(tom);

        // Printam lista de Cats pentru a verifica obiectele
        System.out.println(cats);
    }
}
