package org.example.structural.decorator.messanger;

public class MessengerDecorator extends Messenger {
    private final Messenger messenger;

    public MessengerDecorator(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public void setMessage(String message) {
        this.messenger.setMessage("{" + message + "}");
    }
}
