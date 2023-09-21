package org.example.structural.decorator.house;

public class HouseWithSecondFloor extends HouseDecorator {
    private final House house;

    public HouseWithSecondFloor(House house) {
      this.house = house;
    }

    @Override
    public String getInfo() {
        return house.getInfo() + " with second floor";
    }

    @Override
    public int getPrice() {
        return house.getPrice() + 25_000;
    }
}
