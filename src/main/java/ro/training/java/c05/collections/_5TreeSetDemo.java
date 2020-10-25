package ro.training.java.c05.collections;

import ro.training.java.c05.model._1basic.Cat;
import ro.training.java.c05.model._3comparing.CatWithComparable;

import java.util.Comparator;
import java.util.TreeSet;

public class _5TreeSetDemo {
    public static void main(String[] args) {
        Cat garfield = new Cat();
        garfield.setName("Garfield");
        garfield.setColor("Orange");

        Cat tom = new Cat();
        tom.setName("Thomas");
        tom.setColor("Blue");

        /**
         * Codul de mai jos, daca se decomenteaza, nu va functiona
         * sa adaugam variabila `garfield` in `catsWithoutComparing`,
         * fiindca:
         *  1. Nici Cat nu implementeaza Comparable (deci nu are comparator natural)
         *  2. Nici `catsWithoutComparing` nu si-a definit comparator custom
         *  Daca una din aceste 2 conditii sunt satisfacute, codul va functiona.
         *
         * TreeSet<Cat> catsWithoutComparing = new TreeSet<>();
         * catsWithoutComparing.add(garfield);
         * catsWithoutComparing.add(tom);
         */

        // Acest TreeSet va compara dupa campul `name` din clasa `Cat`. Este un comparator customizat.
        TreeSet<Cat> catsWithCustomComparing = new TreeSet<>(Comparator.comparing(Cat::getName));
        catsWithCustomComparing.add(tom);
        catsWithCustomComparing.add(garfield);

        // La printare, desi am adaugat pe `tom` primul, garfiel va fi pus primul, datorita ordonarii alfabetice.
        System.out.println("\n TreeSet cu pisici sortate dupa comparator custom:");
        System.out.println(catsWithCustomComparing);

        // Acest TreeSet foloseste o comparare naturala, adica o clasa care implementeaza Comparable.
        // Daca ne uitam in clasa `CatWithComparable`, vedem ca are `implements Comparable<...`
        // si face Override la metoda `compareTo`.
        // Fiindca acestea (interfata si metoda) se gasesc in clasa `CatWithComparable`,
        // numim aceasta o comparare naturala.
        TreeSet<CatWithComparable> catsWithNaturalComparing = new TreeSet<>();

        CatWithComparable felix = new CatWithComparable();
        felix.setName("Felix");
        felix.setColor("Yello");
        catsWithNaturalComparing.add(felix);

        CatWithComparable bob = new CatWithComparable();
        bob.setName("Bob");
        bob.setColor("White");
        catsWithNaturalComparing.add(bob);

        // Vedem ca si acest TreeSet a fost sortat dupe numele pisicii
        // Sortarea s-a facut folosind astfel metoda `compareTo` din clasa `CatWithComparable`
        System.out.println("\n TreeSet cu pisici sortate dupa comparator natural:");
        System.out.println(catsWithNaturalComparing);
    }
}
