package org.example.behaviorial.mediator;

public interface Mediator {
    public void notify(Component sender, Component receiver, String data, Event event);
}
