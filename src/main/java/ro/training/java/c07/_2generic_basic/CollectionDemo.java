package ro.training.java.c07._2generic_basic;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

    /**
     * This <> is the diamond operator and is directly linked to generics.
     * It encloses the generic type.
     * @param args
     */
    public static void main(String[] args) {
        List stringList = new ArrayList();
        stringList.add("ceva");
        stringList.add("altceva");
        //stringList.add(Integer.valueOf(3));

//        String secondString = (String) stringList.get(1); // works
//        String thirdString = (String) stringList.get(2); // will fail at runtime,
//                                                        because Java is a strongly typed language



        System.out.println(stringList);
    }
}
