package org.example.behaviorial.visitor;

public class VisitorImpl implements Visitor {
    @Override
    public void visitDot(Dot dot) {
        System.out.println("visited dot");
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        System.out.println("visited triangle");
    }
}
