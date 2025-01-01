
import java.util.Scanner;

// Q 1) create a class three methods
// a) void cube(int a)
// b) void square (int b)
// c) void greater(int a,int b,int c)

// create another class having main method
// display menu
//   1) cube
//   2) square
//   3) greater
// Ask choice from user and based on choice call above methods
// Repeat the menu till choice is not equal to 0


class MathOperations{
    void cube(int a){
        System.out.print("Cube of a number is " + a*a*a);
    }

    void square(int b){
        System.out.print("Square of number is " + b*b);
    }

    void greater(int a, int b, int c){
        if(a > b && a > c){
            System.out.print("The greatest number among " + a + ", " + b + ", and " + c + " is: " + a);
        }else if(b > a && b > c){
            System.out.print("The greatest number among " + a + ", " + b + ", and " + c + " is: " + b);
        }else{
            System.out.print("The greatest number among " + a + ", " + b + ", and " + c + " is: " + c);
        }
    }
}

public class Que1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MathOperations operations = new MathOperations();
        int choice;

        do{
            System.out.println("Menu -");
            System.out.println("1) Cube");
            System.out.println("2) Square");
            System.out.println("3) Greater");
            System.out.println("4) Exit");

            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice){
                case 1:
                System.out.print("Enter number to finds its cube: ");
                int cubeOfNum = s.nextInt();
                operations.cube(cubeOfNum);
                case 1:
                System.out.print("Enter number to finds its cube: ");
                int cubeOfNum = s.nextInt();
                operations.cube(cubeOfNum);
                case 1:
                System.out.print("Enter number to finds its cube: ");
                int cubeOfNum = s.nextInt();
                operations.cube(cubeOfNum);
            }
        }
    }
}
