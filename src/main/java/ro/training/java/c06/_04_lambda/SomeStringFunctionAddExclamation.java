package ro.training.java.c06._04_lambda;

public class SomeStringFunctionAddExclamation implements SomeStringFunction {
    @Override
    public String operateOnString(String input) {
        return input + "!";
    }
}
