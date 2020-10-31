package ro.training.java.c06._05_immutable;

public class ImmutableStringDemo {
    public static void main(String[] args) {
        String someString = "abcd"; // This class (String) is immutable
        String newString = someString.replace("d", "e"); // This does not modify `someString`, instead it returns a new String
        System.out.println("someString: " + someString);
        System.out.println("newString: " + newString);

        String lowercase = someString.toUpperCase();
        System.out.println("someString.toUpperCase: " + someString);
        System.out.println("lowercase: " + lowercase);

        int intPrimitive = 1; //primitive, type begins with smallcase (int)
        Integer intObject = Integer.parseInt("1"); //wrapper class, type is a class (Integer), begins with uppercase
    }
}
