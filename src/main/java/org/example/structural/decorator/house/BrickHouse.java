package org.example.structural.decorator.house;

public class BrickHouse extends House {

    public BrickHouse() {
        setInfo("BrickHouse");
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
