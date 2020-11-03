package ro.training.java.c07._07pairs;

import ro.training.java.c07.model.Professor;
import ro.training.java.c07.model.Student;

public class PairDemo {
    public static void main(String[] args) {
        NonGenericPair pair1 = new NonGenericPair(); // will only contain a String-type Key and a String-type Value
        String k1 = pair1.getKey();
        String v1 = pair1.getValue();

        GenericPair<Integer, Float> genericPair1 = new GenericPair(); //Key is Integer, value is Float
        Integer k2 = genericPair1.getKey();
        Float v2 = genericPair1.getValue();

        GenericPair<String, Integer> genericPair2 = new GenericPair<>(); // Key is String, value if Integer
        String k3 = genericPair2.getKey();
        Integer v3 = genericPair2.getValue();

        boolean isP1EqualTop2 = CompareUtil.isEqual(genericPair1, genericPair2);

        GenericPair<Professor, Student> genericPair3 = new GenericPair<>(); //Key is Professor-type, Value is Student-type

    }
}
