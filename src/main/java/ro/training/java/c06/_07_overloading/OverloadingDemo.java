package ro.training.java.c06._07_overloading;

public class OverloadingDemo {
    public static void main(String[] args) {
        int number = 56;
        int number2 = 336;
        byte numberAsByte = 100;
        String someString = "asd";

        printThis(number);
        printThis(someString);
        printThis(number, number2, someString);
        printThis(4, 6, 32, 101, 542); // var-args, we can give as many args as we want.

        // printThis(numberAsWrappedByte); => won't work
        // byte can be autoboxed to Byte, but cannot be widened to int + autoboxed to Integer. Too much for Java to know!
    }

    static void printThis(String textToPrint) {
        System.out.println("String: " + textToPrint);
    }

    static void printThis(int firstNumber, int secondNumber, String comment) {
        // printf formats replacing %d with given numbers, %s with Strings, in the given order
        // println does not do this formatting
        System.out.printf("first number %d, second number %d, and %s\n", firstNumber, secondNumber, comment);
    }

    static void printThis(long longNumber) {
        System.out.println("long: " + longNumber);
    }

    static void printThis(Integer wrappedInt) { // int will go here, Integer will go here, byte will not go here
        System.out.println("Integer: " + wrappedInt);
    }

    static void printThis(Long wrappedLong) {
        System.out.println("Long: " + wrappedLong);
    }

    static void printThis(int... intArray) {
        System.out.println("int...: " + intArray);
    }
}
