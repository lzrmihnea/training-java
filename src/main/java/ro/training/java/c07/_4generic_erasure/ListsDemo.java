package ro.training.java.c07._4generic_erasure;

import java.util.ArrayList;
import java.util.Objects;

public class ListsDemo {

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        String firstStr = stringArrayList.get(0); // same method, different return type (String)

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Integer firstInt = integerArrayList.get(0); // same method, different return type (Integer)
    }

}
