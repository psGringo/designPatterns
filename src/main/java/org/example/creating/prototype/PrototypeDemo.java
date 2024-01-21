package org.example.creating.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {
    public static void execute() {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapeClones = new ArrayList<>();
        shapes.add(new Dot());
        shapes.add(new Triangle());

        // polymorphism
        shapeClones.add(shapes.get(0));
        shapeClones.add(shapes.get(1));
        shapeClones.forEach(shape -> System.out.println(shape.getClass().getSimpleName()));
    }
}
