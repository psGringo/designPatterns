package org.example;

import org.example.behaviorial.mediator.MediatorDemo;
import org.example.behaviorial.middleware.MiddlewareDemo;
import org.example.creating.abstractFactory.AbstractFactoryDemo;
import org.example.creating.factory.FactoryDemo;
import org.example.structural.decorator.house.HouseDecoratorDemo;
import org.example.structural.decorator.messanger.MessengerDecoratorDemo;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryDemo.Execute();
        FactoryDemo.Execute();
        HouseDecoratorDemo.Execute();
        MessengerDecoratorDemo.Execute();
        MediatorDemo.Execute();
        MiddlewareDemo.execute();
    }
}