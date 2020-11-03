package ro.training.java.c07._5wildcards;

import java.util.ArrayList;
import java.util.List;

public class GenericWildcardsDemo {

    public static void main(String[] args) {
        List<? extends Number> numberList = createIntegerList();
    }

    static List<Integer> createIntegerList() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(Integer.valueOf(1));
        integers.add(Integer.valueOf(4));
        return integers;
    }

    <T extends Number> void printSomething(T toPrint) {
        System.out.println();
    }

}
