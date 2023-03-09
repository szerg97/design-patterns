package com.szalai.designpatterns.creational.abstractfactory;

public class FactoryProvider {

    public static AbstractFactory<?> getFactory(String choice){
        return switch (choice.toLowerCase()){
            case "animal" -> new AnimalFactory();
            case "color" -> new ColorFactory();
            default -> null;
        };
    }
}
