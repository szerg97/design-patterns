package com.szalai.designpatterns.creational.abstractfactory;

public class ColorFactory implements AbstractFactory<Color>{
    @Override
    public Color create(String animalType) {
        return switch (animalType.toLowerCase()){
            case "duck" -> new BlueColor();
            case "dog" -> new RedColor();
            default -> null;
        };
    }
}
