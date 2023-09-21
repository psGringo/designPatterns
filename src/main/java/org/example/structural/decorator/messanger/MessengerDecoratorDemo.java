package org.example.structural.decorator.messanger;

public class MessengerDecoratorDemo {

    public static void Execute() {

        System.out.println("MessenerDecoratorDemo");

        Messenger messenger = new Messenger();
        messenger.setMessage("Hello");
        System.out.println(messenger.getMessage());


        MessengerDecorator messengerDecorator = new MessengerDecorator(messenger);
        messengerDecorator.setMessage("Hello");
        System.out.println(messenger.getMessage());

        System.out.println();
    }
}
