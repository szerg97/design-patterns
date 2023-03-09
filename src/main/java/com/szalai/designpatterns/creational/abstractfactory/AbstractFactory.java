package com.szalai.designpatterns.creational.abstractfactory;

public interface AbstractFactory <T>{
    T create(String animalType);
}
