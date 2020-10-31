package ro.training.java.c06._06_autoboxing_widening;

public class AutoboxingAndWideningDemo {
    public static void main(String[] args) {
        // Autoboxing
        System.out.println("\n1. Autoboxing (primitive to wrapper)");
        int firstInt = 101;
        Integer firstIntWrapped = firstInt;
        System.out.println(firstIntWrapped);

        //Unboxing
        System.out.println("\n2. Unboxing (wrapper to primitive)");
        Integer wrappedInt = Integer.parseInt("504");
        int primitiveInt = wrappedInt;
        System.out.println(primitiveInt);

        //Widening
        System.out.println("\n3. Widening (smaller primitive to larger primitive)");
        byte b=10;
        short bAsShort = b; // it will be done automatically, it will always fit
        float bAsFloat = b; // widened to float
        int bAsInt = b; // widened to int
        System.out.println("b as byte: " + b);
        System.out.println("b as short: " + bAsShort);
        System.out.println("b as int: " + bAsInt);
        System.out.println("b as float: " + bAsFloat);

        //Narrowing
        System.out.println("\n4. Narrowing (larger primitive to smaller primitive)");
        double payment = 99999.99;
        float paymentFloat = (float) payment; // You do not know if the float can contain the double, so we need to explicitly cast
        int paymentInt = (int) paymentFloat; // Integers cannot contain decimal places, it losses precision
        byte paymentByte = (byte) payment; // Since it can only contain -128 to 127, it will not contain the whole value
        System.out.println("payment double: " + payment);
        System.out.println("payment float: " + paymentFloat);
        System.out.println("payment int: " + paymentInt);
        System.out.println("payment byte: " + paymentByte);

    }
    // Primitive memory usage: char < byte < short < int < long < float < double
}
