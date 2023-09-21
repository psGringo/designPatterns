package org.example.creating.abstractFactory;

public class Client {

    private IProductA productA;
    private IProductB productB;

    private IProductA ProduceProductA(IAbstractFactory factory) {
        return factory.createProductA();
    }

    private IProductB ProduceProductB(IAbstractFactory factory) {
        return factory.createProductB();
    }

    public IProductA getProductA() {
        return productA;
    }

    public IProductB getProductB() {
        return productB;
    }

    public Client(boolean isFabricOne) {
        if (isFabricOne) {
            productA = ProduceProductA(new FactoryOne());
            productB = ProduceProductB(new FactoryOne());
        } else {
            productA = ProduceProductA(new FactoryTwo());
            productB = ProduceProductB(new FactoryTwo());
        }
    }
}
