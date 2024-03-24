package org.example.creating.factory;


public class FactoryDemo {
    public static void Execute() {
        System.out.println("FactoryDemo");
        boolean isNeedProduceProductA = true;

        Client client;

        if (isNeedProduceProductA) {
            client = new Client(new FactoryA());
        } else {
            client = new Client(new FactoryB());

        }
        client.doStuff();


    }
}

