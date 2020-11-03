package ro.training.java.c07._07pairs;

public class GenericPair<T, E> implements Pair<T, E> {

    private T genericKey;
    private E genericValue;

    public static <W> String getString(W toPrint) {
        return toPrint.toString();
    }

    @Override
    public T getKey() {
        return genericKey;
    }

    @Override
    public E getValue() {
        return genericValue;
    }

}
