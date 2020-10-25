package ro.training.java.c05.collections;

import ro.training.java.c05.model._1basic.Cat;

import java.util.HashMap;

public class _4HashMapDemo {

    public static void main(String[] args) {
        // Vom crea un Map in care vom pune ca si Key numele intreg al pisicilor
        // si ca si Value, obiecte de pisici.
        // Key-urile sunt unice, deci nu vom putea avea aceeasi cheie.
        // Dar putem avea un Value la mai multe Key
        HashMap<String, Cat> catsByFullName = new HashMap<>();

        Cat garfield = new Cat();
        garfield.setName("Garfield");
        garfield.setColor("Orange");
        catsByFullName.put("Garfield the cat", garfield);

        Cat tom = new Cat();
        tom.setName("Thomas");
        tom.setColor("Blue");
        catsByFullName.put("Tom din Tom si Jerry", tom);

        catsByFullName.put("Tom din alt desen animat", tom);

        System.out.println("\n Observam ca putem avea pe `tom` de 2 ori la Key-uri diferite:");
        System.out.println("1: " + catsByFullName);

        catsByFullName.put("Tom din alt desen animat", garfield);
        System.out.println("\n Observam ca daca punem pe `garfield` la un Key deja existent, va suprascrie valoarea precedenta:");
        System.out.println("2: " + catsByFullName);

    }
}
