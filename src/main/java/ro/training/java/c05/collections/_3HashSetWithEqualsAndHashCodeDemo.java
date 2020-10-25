package ro.training.java.c05.collections;

import ro.training.java.c05.model._2overridingmethods.CatWithEqualsAndHashCode;

import java.util.HashSet;

public class _3HashSetWithEqualsAndHashCodeDemo {
    public static void main(String[] args) {

        // Cream un nou HashSet
        HashSet<CatWithEqualsAndHashCode> cats = new HashSet<>();

        // Cream si adaugam variabila 'garfield' in lista 'cats'
        CatWithEqualsAndHashCode garfield = new CatWithEqualsAndHashCode(); // ! se creeaza si aloca zona in memorie primul obiect.
        garfield.setName("Garfield");
        garfield.setColor("Orange");
        cats.add(garfield);

        // Cream si adaugam variabila 'garfield' in lista 'cats'
        CatWithEqualsAndHashCode tom = new CatWithEqualsAndHashCode(); // ! se creeaza si aloca zona in memorie pentru al doilea obiect
        tom.setName("Thomas");
        tom.setColor("Blue");
        cats.add(tom);

        // Printam lista de CatWithEqualsAndHashCodes pentru a verifica obiectele
        // Observam ca are cele doua obiecte
        System.out.println(cats);

        CatWithEqualsAndHashCode garfield2 = new CatWithEqualsAndHashCode(); // ! se creeaza si aloca zona in memorie pentru al treilea obiect
        garfield2.setName("Garfield");
        garfield2.setColor("Orange");
        cats.add(garfield2);
        System.out.println(cats);
        // HashSet-ul are 2 elemente
        // In clasa CatWithEqualsAndHashCode, equals si hashCode compara dupa `name` si `color`
        // Deci, desi sunt 3 obiecte diferite, fiindca sunt comparate dupa aceste campuri,
        // HashSet-ul vede obiectele cu acelasi `name` si `color` ca fiind acelasi obiect.
    }
}
