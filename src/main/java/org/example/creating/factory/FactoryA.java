package org.example.creating.factory;

public class FactoryA extends Factory {
    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}
