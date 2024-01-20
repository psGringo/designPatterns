package org.example.behaviorial.mediator;

public class MediatorDemo {

    private static Mediator mediator;
    private static ComponentA componentA;
    private static ComponentB componentB;

    public static void Execute() {
        mediator = new MediatorImpl();
        componentA = new ComponentA(mediator);
        componentB = new ComponentB(mediator);
        componentA.getMediator().notify(componentA, componentB, "hello from component A", Event.SendMessage);
    }
}
