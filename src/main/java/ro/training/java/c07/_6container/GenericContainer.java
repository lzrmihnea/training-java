package ro.training.java.c07._6container;

import ro.training.java.c07.model.Human;

public class GenericContainer <T extends Human> {
    T innerObj;

    public T getInnerObj() {
        return innerObj;
    }

    public void setInnerObj(T innerObj) {
        this.innerObj = innerObj;
    }
}
