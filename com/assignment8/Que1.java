package com.assignment8;

// Q1 wap to demonstarte one to one assocation using class car and Engine
class Engine {

    private String model;

    public Engine(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

class Car {

    private String make;
    private Engine engine;

    public Car(String make, Engine engine) {
        this.make = make;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public Engine getEngine() {
        return engine;
    }
}

public class Que1 {

    public static void main(String[] args) {
        Engine e1 = new Engine("V8");
        Car c1 = new Car("Ford Mustang", e1);

        System.out.println("Car Make: " + c1.getMake());
        System.out.println("Engine Model: " + c1.getEngine().getModel());
    }
}
