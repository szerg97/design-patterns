package com.szalai.designpatterns.creational.builder;

public class App {

    public static void main(String[] args) {
        Car car1 = Car.builder()
                .brand("Mercedes")
                .speed(120.0)
                .build();

        Car car2 = new Car();
        car2.setBrand("BMW");
        car2.setLoad(56.5);
        car2.setSpeed(115.0);

        Car car3 = new Car("Opel", 100.5, 80.0);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
