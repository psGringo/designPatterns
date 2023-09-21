package org.example.creating.factory;

public class FactoryDemo {
    public static void Execute() {
        System.out.println("FactoryDemo");
        boolean isNeedProduceProductA = true;
        Client client = new Client(isNeedProduceProductA);
        client.getProduct().doStuff();
        System.out.println();
    }
}

