package org.example.creating.abstractFactory;

public class FactoryOne implements IAbstractFactory {
    @Override
    public IProductA createProductA() {
        return new ProductAOne();
    }

    @Override
    public IProductB createProductB() {
        return new ProductBOne();
    }
}
