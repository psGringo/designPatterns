package org.example.creating.prototype;

public class Dot  extends Shape implements CloneableShape {
    @Override
    public Shape clone() {
        return new Dot();
    }
}
