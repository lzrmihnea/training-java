package ro.training.java.c18.refactoring_separation_of_concerns;

public class Shape {
    /**
     * circle, square, rectangle, hexagon
     */
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    private String getMessage() {
        return "This is a " + this.getType();
    }

    public void drawShape() {
        System.out.println(getMessage());
    }

    /**
     * other behavior should be in this class if it is Shape-specific
     */

}
