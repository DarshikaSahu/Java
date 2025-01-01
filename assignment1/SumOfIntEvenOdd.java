// Q6 Write a function that takes an  10 integer  and returns the sum of all even and odd numbers

import java.util.Scanner;

public class SumOfIntEvenOdd {
    public static int[] calcSum(int[] arr) {
        int evenSum = 0;
        int oddSum = 0;

        for(int num : arr){
            if(num % 2 == 0){
                evenSum = evenSum + num;
            }
            else{
                oddSum = oddSum + num;
            }
        }
        return new int[] {evenSum, oddSum};
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = 10;
        int arr[] = new int[k];
        System.out.println("Enter 10 integer: ");
        
        for (int i = 0; i < 10; i++) {
            arr[i] = s.nextInt();
        }
        
        int[] sum = calcSum(arr);
        
        System.out.println("Sum of even numbers: " + sum[0]);
        System.out.println("Sum of odd numbers: " + sum[1]);
        s.close();

    }
}
