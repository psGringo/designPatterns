package org.example.structural.decorator.house;

public class HouseDecoratorDemo {
    public static void Execute() {
        System.out.println("HouseDecoratorDemo");
        BrickHouse house = new BrickHouse();
        HouseWithSecondFloor houseWithSecondFloor = new HouseWithSecondFloor(house);
        HouseWithGarage houseWithGarage = new HouseWithGarage(house);

        System.out.printf("%s %d", houseWithSecondFloor.getInfo(), houseWithSecondFloor.getPrice());
        System.out.println();
        System.out.printf("%s %d", houseWithGarage.getInfo(), houseWithGarage.getPrice());
        System.out.println();
        System.out.println();
    }
}
