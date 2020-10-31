package ro.training.java.c06._01_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStringDemo {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Cristi");
        stringList.add("Mihai");
        stringList.add("Cosmin");
        stringList.add("Amalia");
        stringList.add("Diana");
        stringList.add("Aura");
        stringList.add("Ioana");
        stringList.add("Sami");

        System.out.println("\n Simple for");
        for(int i=0 ; i<stringList.size(); i++ ) {
            System.out.println(stringList.get(i)); //aceasta sintaxa e scrisa mai usor in enhanced for-ul de mai jos
        }
        System.out.println("\n Enhanced for");
        for(String singleString : stringList) {
            System.out.println(singleString);
        }

        System.out.println("\n forEach with lambda");
        stringList.forEach(singleString -> System.out.println(singleString)); //System.out.println(singleString) is in the body of the lambda function

        System.out.println("\n stream with filtering");
        stringList
                .stream()
                .filter(singleString -> singleString.equals("Ioana") || singleString.equals("Sami"))
                .forEach(singleString -> System.out.println(singleString));

        long count = stringList
                .stream()
                .count();
        System.out.println("\n numarul de elemente: " + count);

        System.out.println("\n mapping Strings");
        List<String> mappedStrings = stringList
                .stream()
                .map(singleString -> " * " + singleString)
                .collect(Collectors.toList());
        mappedStrings.forEach(singleString -> System.out.println(singleString));

        System.out.println(" \n mapping Strings to uppercase");
        stringList
                .stream()
                .map(singleString -> singleString.toUpperCase())
                .forEach(aString -> System.out.println(aString));
    }
}
