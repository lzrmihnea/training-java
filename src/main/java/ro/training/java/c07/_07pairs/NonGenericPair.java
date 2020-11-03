package ro.training.java.c07._07pairs;

public class NonGenericPair implements Pair<String, String> {

    private String someKey;
    private String someValue;

    @Override
    public String getKey() {
        return someKey;
    }

    @Override
    public String getValue() {
        return someValue;
    }
}
