
import java.util.Scanner;

// Q4  Write a function that takes an integer n and prints the multiplication table for that number (from 1 to 10) using a loop.

class multiplication_Table{
    void table(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = s.nextInt();
        
        System.out.println("Multiplication Table for " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
            s.close();
        }
    }
}

public class MultiplicationTable {
    public static void main(String[] args) {
        multiplication_Table output = new multiplication_Table();
        output.table();
    }
}
