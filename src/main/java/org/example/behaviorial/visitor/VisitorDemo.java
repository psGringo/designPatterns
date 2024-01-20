package org.example.behaviorial.visitor;

public class VisitorDemo {

    public static void execute() {
        Dot dot = new Dot();
        Triangle triangle = new Triangle();
        Visitor visitor = new VisitorImpl();

        dot.accept(visitor);
        triangle.accept(visitor);
    }

}
