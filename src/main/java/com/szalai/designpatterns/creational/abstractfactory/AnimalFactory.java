package com.szalai.designpatterns.creational.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal>{

    @Override
    public Animal create(String animalType) {
        return switch (animalType.toLowerCase()) {
            case "dog" -> new Dog();
            case "duck" -> new Duck();
            default -> null;
        };
    }
}
