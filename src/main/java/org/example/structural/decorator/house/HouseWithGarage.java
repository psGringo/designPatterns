package org.example.structural.decorator.house;

public class HouseWithGarage extends HouseDecorator {
    private final House house;

    public HouseWithGarage(House house) {
        this.house = house;
    }

    @Override
    public String getInfo() {
        return house.getInfo() + " with garage";
    }

    @Override
    public int getPrice() {
        return house.getPrice() + 100000;
    }
}
