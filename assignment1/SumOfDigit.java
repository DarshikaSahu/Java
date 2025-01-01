
import java.util.Scanner;

// Q 3   Create a function that takes an integer and returns the sum of its digits. Use a loop to extract each digit and perform  the sum. 

class Calc{
    int sumDigit(){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int digit = s.nextInt();
        int sum = 0;
        int rem = digit;

        while(rem >= 10){
            sum = sum + (rem % 10);
            rem = rem / 10;
            s.close();
        }
        sum = sum + rem;
        return sum;

    }
}

public class SumOfDigit {
    public static void main(String[] args) {
        
        Calc output = new Calc();
		
		int final_sum = output.sumDigit();
		System.out.println("Sum of digit: "+ final_sum);

        
    }
}
