package ro.training.java.c06._04_lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        SomeStringFunction addExclamation = anyString -> anyString + "!"; // One way of writing it (Same thing as SomeStringFunctionAddExclamation)
        SomeStringFunction addQuestionMark = anyString -> { //Another way of writing it
            String newString = anyString + "?";
            return newString;
        };

        printAndExecute("MyFirstString", addExclamation);
        printAndExecute("Do Something ", addExclamation);
        printAndExecute("Wow, this is cool", addQuestionMark);

        MultipleStringFunction concateWithMinuses = (firstString, secondString) -> firstString + " - " + secondString; // -> MINUS & LARGER THAN
        MultipleStringFunction upperCaseAndLowercase = (first, second) -> first.toUpperCase() + " &&& " + second.toLowerCase();

        printAndExecute("abc", "123", concateWithMinuses);
        printAndExecute("Mihnea", "Cristi", concateWithMinuses);
        printAndExecute("Amalia", "Un String Aleator", upperCaseAndLowercase);
    }

    static void printAndExecute(String s1, String s2, MultipleStringFunction func) {
        String newString = func.operateOnMultiple(s1, s2);
        System.out.println(newString);
    }

    static void printAndExecute(String mystring, SomeStringFunction doSomething) {
        System.out.println("\n Before " + mystring);
        String newString = doSomething.operateOnString(mystring);
        System.out.println(" After " + newString);
    }
}
