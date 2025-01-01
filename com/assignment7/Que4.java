package com.assignment7;

//Q 4 Create a Function<Double, Double> that converts a temperature from Celsius 
//	to Fahrenheit using the formula:
//    Fahrenheit = (Celsius * 9/5) + 32
//    Accept a Celsius temperature and print the equivalent Fahrenheit temperature.
//    Input: 25.0
//    Output: "25.0 Celsius is equal to 77.0 Fahrenheit"
import java.util.Scanner;

class CelsiusToFahrenheit {

    double CTF(double x, double y) {
        y = (x * 9 / 5) + 32;
        return y;
    }
}

public class Que4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter temperature in celcius: ");

        double Celcius = s.nextDouble();
        double Fahrenheit = 0;

        CelsiusToFahrenheit C = new CelsiusToFahrenheit();

        System.out.println(Celcius + " Celcius is equal to " + C.CTF(Celcius, Fahrenheit) + " Fahrenheit");
    }

}
