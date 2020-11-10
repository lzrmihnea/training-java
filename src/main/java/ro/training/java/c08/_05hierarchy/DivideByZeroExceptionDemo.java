package ro.training.java.c08._05hierarchy;

import java.util.Scanner;

public class DivideByZeroExceptionDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double result = 100000;
        while(in.hasNext()) {
            String nextLine = in.nextLine();
            result = result / getNumber(nextLine);
            System.out.println(result);
        }
    }
    static Integer getNumber(String text) {
        return Integer.valueOf(text);
    }
}
