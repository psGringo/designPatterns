package org.example.structural.decorator.house;

public class WoodenHouse extends House {
    public WoodenHouse() {
        setInfo("WoodenHouse");
    }

    @Override
    public int getPrice() {
        return 3000;
    }
}
