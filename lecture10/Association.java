//Q 1 wap to demonstrate one to one association using class car and Engine

class Engine {

    String model;
    int horsepower;

    public Engine(String model, int horsepower) {
        this.model = model;
        this.horsepower = horsepower;
    }

    @Override

    public String toString() {
        return "Engine model = " + model + ", horsepower = " + horsepower;
    }
}

class Car {

    Engine e;
    String model;
    String color;

    public Car(Engine e, String model, String color) {
        this.e = e;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car [" + e + ", car model = " + model + ", color = " + color + "]";
    }
}

public class Association {

    public static void main(String[] args) {
        Engine e = new Engine("v8", 700);
        Car c = new Car(e, "Nexon", "Black");
        System.out.println(c);
    }
}
