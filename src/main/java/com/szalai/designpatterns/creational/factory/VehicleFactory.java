package com.szalai.designpatterns.creational.factory;

public class VehicleFactory implements Factory<Vehicle> {

    @Override
    public Vehicle create(String type) {
        return switch (type) {
            case "car" -> new Car("Mercedes Benz", 120.0, 250.0);
            case "truck" -> new Truck("Scania", 60.0, 1500.5);
            default -> throw new IllegalStateException("Type is inappropriate");
        };
    }
}
