package org.example.behaviorial.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private Originator originator;
    private List<Originator.Memento> history;


    public Caretaker(Originator originator) {
        this.originator = originator;
        history = new ArrayList<>();
    }

    public void doSmth() {
        System.out.println(originator.getState());
        Originator.Memento memento = originator.save();
        history.add(memento);
        originator.setState("another state");
        System.out.println(originator.getState());
        undo();
        System.out.println("restoring state...");
        System.out.println(originator.getState());
    }

    public void undo() {
        if (history.size() > 0) {
            Originator.Memento memento = history.get(history.size() - 1);
            originator.restore(memento);
            history.remove(history.size() - 1);
        } else System.out.println("history is empty");
    }
}
