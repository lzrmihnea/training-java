package ro.training.java.c18.refactoring_separation_of_concerns;

import java.util.ArrayList;
import java.util.List;

public class DrawingService {

    // private Repository repo;...

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape("CIRCLE"));
        shapes.add(new Shape("SQUARE"));
        shapes.add(new Shape("RECTANGLE"));
        shapes.add(new Shape("HEXAGON"));

        for(Shape singleShape : shapes) {
            singleShape.drawShape();
        }
    }
}
