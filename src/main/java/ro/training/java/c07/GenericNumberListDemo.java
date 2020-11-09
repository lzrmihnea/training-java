package ro.training.java.c07;

import java.util.ArrayList;
import java.util.List;

public class GenericNumberListDemo {
    public static void main(String[] args) {
         List<? extends Number> numberList = createLongList();
    }

    static ArrayList<Long> createLongList() {
        ArrayList<Long> createdList = new ArrayList<>();
        createdList.add(1L);
        createdList.add(24L);
        return createdList;
    }

    static ArrayList<Integer> createIntegerList() {
        ArrayList<Integer> createdList = new ArrayList<>();
        createdList.add(33);
        return  createdList;
    }
}
