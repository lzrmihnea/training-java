package ro.training.java.c05.model._3comparing;

import java.util.Objects;

public class CatWithComparable implements Comparable<CatWithComparable> {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) return true;
        if (otherObj == null || getClass() != otherObj.getClass()) return false;
        CatWithComparable otherCatWithComparable = (CatWithComparable) otherObj;
        return Objects.equals(name, otherCatWithComparable.name) &&
                Objects.equals(color, otherCatWithComparable.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    @Override
    public int compareTo(CatWithComparable other) {
        return this.name.compareTo(other.getName());
    }
}
