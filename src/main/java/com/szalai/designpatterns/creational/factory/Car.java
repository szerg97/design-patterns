package com.szalai.designpatterns.creational.factory;

public class Car extends Vehicle {

    public Car(String brand, Double speed, Double load) {
        this.brand = brand;
        this.speed = speed;
        this.load = load;
    }
}
