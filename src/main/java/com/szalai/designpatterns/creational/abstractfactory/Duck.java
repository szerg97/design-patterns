package com.szalai.designpatterns.creational.abstractfactory;

public class Duck implements Animal{
    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Quacks";
    }
}
