package org.example.behaviorial.mediator;

public class MediatorImpl implements Mediator {

    private ComponentA componentA;

    private ComponentB componentB;

    @Override
    public void notify(Component sender, Component receiver, String data, Event event) {
        if (event == Event.SendMessage) {
            receiver.ReceiveMessage(data);
        }
    }

    public void setComponentA(ComponentA componentA) {
        this.componentA = componentA;
    }

    public void setComponentB(ComponentB componentB) {
        this.componentB = componentB;
    }
}
