package org.fasttrackit.trainingspring.c20;

import java.util.function.Predicate;

public class DemoFunctionalInterface {

    public static void main(String[] args) {
        Predicate isMaryEatingAnApple = (stringToTest) -> stringToTest.toString().length() > 10;
        doATest(isMaryEatingAnApple, "Maria-Anamaria");

        Predicate anotherPredicate = (asd) -> asd != null;
        doATest(anotherPredicate, "someText");

    }

    public static boolean doATest(Predicate someRandomTest, String testString) {
        return someRandomTest.test(testString);
    }
}
