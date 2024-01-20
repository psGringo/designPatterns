package org.example.behaviorial.memento;

public class MementoDemo {
    public static void execute() {
        Originator originator = new Originator("initial state");
        Caretaker caretaker = new Caretaker(originator);
        caretaker.doSmth();
    }
}
