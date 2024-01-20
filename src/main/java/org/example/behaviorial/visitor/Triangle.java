package org.example.behaviorial.visitor;

public class Triangle extends Shape {
    public void accept(Visitor visitor) {
        visitor.visitTriangle(this);
    }
}
