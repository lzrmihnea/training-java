package ro.training.java.c05.model._2overridingmethods;

import java.util.Objects;

public class CatWithEqualsAndHashCode {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatWithEqualsAndHashCode catWithEqualsAndHashCode = (CatWithEqualsAndHashCode) o;
        return Objects.equals(name, catWithEqualsAndHashCode.name) &&
                Objects.equals(color, catWithEqualsAndHashCode.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}
