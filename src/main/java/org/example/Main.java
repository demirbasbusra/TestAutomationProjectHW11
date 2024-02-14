package org.example;

public class Main {
    public static void main(String[] args) {

        // Singleton pattern example
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Builder pattern example
        Car car = new Car.Builder("Toyota", "Camry")
                .year(2020)
                .mileage(5000)
                .build();
        car.displayInfo();
    }
}