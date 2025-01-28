package java_lab;

// Q3  Write a Java class Car with the following attributes: make, model, year, and color. Implement a constructor that initializes 
// these attributes when an object of the Car class is created. Write a main method to create an instance of Car and display its 
// attributes.Enhance the Car class from the previous question by adding a parameterized constructor that takes values for make, 
// model, year, and color as arguments. Demonstrate the use of this constructor in the main method.
class Car {

    private String make;
    private String model;
    private int year;
    private String color;

    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.color = "Unknown";
    }

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

}

public class Que3 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.display();

        System.out.println("With using of Parameterized function:\n");

        Car car2 = new Car("Nexon", "Camry", 2021, "Matte-Black");
        car2.display();
    }
}
