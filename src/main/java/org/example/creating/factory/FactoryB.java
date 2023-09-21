package org.example.creating.factory;

public class FactoryB extends Factory {
    @Override
    public IProduct createProduct() {
        return new ProductB();
    }
}
