package ro.training.java.c07._3generic_wrong;

import java.util.ArrayList;
import java.util.List;

public class GenericWrongDemo {
    public static void main(String[] args) {
//        List<Number> numberList = createNumberList(); // wrong
//        System.out.println(numberList);
    }

    static ArrayList<Long> createNumberList() {
        ArrayList<Long> numbers = new ArrayList();
        numbers.add(Long.valueOf(1));
        numbers.add(Long.valueOf(2));
        return numbers;
    }
}
