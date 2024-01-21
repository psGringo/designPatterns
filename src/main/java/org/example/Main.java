package org.example;

import org.example.behaviorial.command.buttonTaskManagerExample.CommandDemo;
import org.example.behaviorial.mediator.MediatorDemo;
import org.example.behaviorial.memento.MementoDemo;
import org.example.behaviorial.middleware.MiddlewareDemo;
import org.example.behaviorial.visitor.VisitorDemo;
import org.example.creating.abstractFactory.AbstractFactoryDemo;
import org.example.creating.factory.FactoryDemo;
import org.example.creating.prototype.PrototypeDemo;
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
        VisitorDemo.execute();
        MementoDemo.execute();
        CommandDemo.execute();
        PrototypeDemo.execute();
    }
}