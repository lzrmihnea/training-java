package ro.training.java.c07._08restriction;

import java.util.ArrayList;
import java.util.List;

public class RestrictionDemo {
    public static <E> void checkIfArrayList(List<E> genericList) {
        if(genericList instanceof ArrayList) {
            System.out.println("It is an ArrayList, dunno what Generic Type");
        }
//        if(genericList instanceof ArrayList<String>) { // polymorphism applies on Instance type, not on Generic type
//            System.out.println("This cannot be done.");
//        }
        List<Integer> integerList = new ArrayList<>();
        List<Number> numberList1 = (ArrayList) integerList; // works
//        List<Number> numberList2 = (ArrayList<Integer>) integerList; // does not work, we cannot cast with Generic Types on known Generic Type of integerList
//        List<Number> numberList3 = (ArrayList<Number>) integerList; // does not work, we cannot cast with Generic Type on known Generic Type of integerList

        ArrayList<String> stringList = (ArrayList<String>) genericList; //works, because we don't know Generic Type of genericList
//        ArrayList<String> stringList2 = (ArrayList<String>) integerList; // does not work, we cannot cast with Generic Type on known Generic Type of integerList
    }
}
