package com.szalai.designpatterns.creational.builder;

public class Car {

    private static final Car instance = new Car();
    private String brand;
    private Double speed;
    private Double load;

    public Car() {
    }

    public Car(String brand, Double speed, Double load) {
        this.brand = brand;
        this.speed = speed;
        this.load = load;
    }

    public static Car builder(){
        return instance;
    }

    public Car brand(String brand){
        instance.brand = brand;
        return instance;
    }

    public Car speed(Double speed){
        instance.speed = speed;
        return instance;
    }

    public Car load(Double load){
        instance.load = load;
        return instance;
    }

    public Car build(){
        return new Car(this.brand, this.speed, this.load);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getLoad() {
        return load;
    }

    public void setLoad(Double load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", load=" + load +
                '}';
    }
}
