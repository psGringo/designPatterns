package org.example.creating.abstractFactory;

public class AbstractFactoryDemo {
    public static void Execute() {
        System.out.println("AbstractFactoryDemo");
        boolean isFabricOne = true;
        Client client = new Client(isFabricOne);
        client.getProductA().doStuff();
        client.getProductB().doStuff();
        System.out.println();
    }
}

