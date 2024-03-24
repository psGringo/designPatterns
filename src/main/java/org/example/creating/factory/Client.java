package org.example.creating.factory;

public class Client {

    private Factory factory;

    public Client(Factory factory) {
        this.factory = factory;
    }

    public void doStuff() {
        System.out.println(factory.createProduct().getClass().getSimpleName());
    }
}
