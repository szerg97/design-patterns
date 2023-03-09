package com.szalai.designpatterns.creational.abstractfactory;

public class App {
    public static void main(String[] args) {
        AbstractFactory<?> factory = FactoryProvider.getFactory("color");
        if (factory instanceof AnimalFactory){
            Duck duck = (Duck)factory.create("duck");
            System.out.println(duck.makeSound());
        }
        else if (factory instanceof ColorFactory){
            BlueColor blueColor = (BlueColor)factory.create("duck");
            System.out.println(blueColor.getName());
        }
    }
}
