package com.szalai.designpatterns.creational.abstractfactory;

public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Wuf";
    }
}
