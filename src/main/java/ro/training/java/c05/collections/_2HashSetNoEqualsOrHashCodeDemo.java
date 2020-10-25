package ro.training.java.c05.collections;

import ro.training.java.c05.model._1basic.Cat;

import java.util.HashSet;

public class _2HashSetNoEqualsOrHashCodeDemo {
    public static void main(String[] args) {

        // Cream un nou HashSet
        HashSet<Cat> cats = new HashSet<>();

        // Cream si adaugam variabila 'garfield' in lista 'cats'
        Cat garfield = new Cat(); // ! se creeaza si aloca zona in memorie primul obiect.
        garfield.setName("Garfield");
        garfield.setColor("Orange");
        cats.add(garfield);

        // Cream si adaugam variabila 'garfield' in lista 'cats'
        Cat tom = new Cat(); // ! se creeaza si aloca zona in memorie pentru al doilea obiect
        tom.setName("Thomas");
        tom.setColor("Blue");
        cats.add(tom);

        // Printam lista de Cats pentru a verifica obiectele
        // Observam ca are cele doua obiecte
        System.out.println(cats);

        Cat garfield2 = new Cat(); // ! se creeaza si aloca zona in memorie pentru al treilea obiect
        garfield2.setName("Garfield");
        garfield2.setColor("Orange");
        cats.add(garfield2);
        System.out.println(cats);
        // Observam ca avem 2 pisici cu acelasi nume si culoare
        // Dar HashSet-ul are 3 elemente
        // Fiindca nu am suprascris equals si hashCode, Java compara
        // dupa zona din memorie a obiectelor.
        // Fiindca am alocat zona in memorie pentru 3 obiecte,
        // HashSet-ul le detecteaza ca obiecte diferite si intra fiecare in HashSet
    }
}
