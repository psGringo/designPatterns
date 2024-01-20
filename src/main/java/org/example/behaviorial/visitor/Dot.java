package org.example.behaviorial.visitor;

public class Dot extends Shape{
    public void accept(Visitor visitor) {
        visitor.visitDot(this);
    }
}
