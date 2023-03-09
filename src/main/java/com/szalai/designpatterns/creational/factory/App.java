package com.szalai.designpatterns.creational.factory;

public class App {

    public static void main(String[] args) {

        String type = "car";

        Factory<Vehicle> factory = new VehicleFactory();
        Vehicle vehicle = factory.create(type);

        display(vehicle);
    }

    private static void display(Vehicle vehicle){
        System.out.println(vehicle);
    }
}
