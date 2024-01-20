package org.example.behaviorial.mediator;

public class ComponentA implements Component {

    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public ComponentA(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void ReceiveMessage(String message) {
        System.out.println(message);
    }
}
