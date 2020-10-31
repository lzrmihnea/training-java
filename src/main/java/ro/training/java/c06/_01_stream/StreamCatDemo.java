package ro.training.java.c06._01_stream;

import ro.training.java.c06.model.Cat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCatDemo {
    public static void main(String[] args) {
        ArrayList<Cat> catList = new ArrayList<>();
        Cat garfield = new Cat();
        garfield.setName("Garfield");
        garfield.setColor("orange");
        catList.add(garfield);

        Cat tom = new Cat();
        tom.setName("Tom");
        tom.setColor("blue");
        catList.add(tom);

        Cat felix = new Cat();
        felix.setName("Felix");
        felix.setColor("blue");
        catList.add(felix);

        System.out.println("Before, we had a list of cats: " + catList);

        List<String> catNamesList = catList
                .stream()
                .map(singleCat -> singleCat.getName())
                .collect(Collectors.toList());

        System.out.println("After, we have a list of cat names: " + catNamesList);

        List<String> blueCatNames = catList
                .stream() // each element is individually sent after this point
                .filter(aCat -> aCat.getColor().equals("blue")) // each element is filtered and only the ones who pass the filter continue
                .map(singleCat -> singleCat.getName()) // each element is mapped (from a type it is converted to another type) => Input Cat -> Output String
                .collect(Collectors.toList()); // each element is collected in a List (probably ArrayList)

        System.out.println("A list of cat names which have the color blue: " + blueCatNames);

        long numberOfCatsWithNamesContainingI = catList
                .stream()
                .filter(matzaAsta -> matzaAsta.getName().contains("i"))
                .count();
        System.out.println("How many cats have names with 'i'? " + numberOfCatsWithNamesContainingI);

        List<String> sortedCatNames = catList
                .stream()
                .map(mitziPisy -> mitziPisy.getName())
                .sorted(Comparator.reverseOrder()) //custom sorting, reverse order
                .collect(Collectors.toList());
        System.out.println("Reversely sorted cat names: " + sortedCatNames);
    }
}
