package org.example.creating.prototype;

public class Triangle extends Shape implements CloneableShape {
    @Override
    public Shape clone() {
        return new Triangle();
    }
}
