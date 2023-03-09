package com.szalai.designpatterns.creational.factory;

public abstract class Vehicle {

    protected String brand;
    protected Double speed;
    protected Double load;

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", load=" + load +
                '}';
    }
}
