//2 ) Write a function that takes a student's score as an argument and returns a letter grade based on the following scale:
// 90-100: A    80-89: B    70-79: C      60-69: D     Below 60: F      Use if-else statements to determine the grade.  

import java.util.Scanner;

public class if_else{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter grade -");

        int grade = s.nextInt();
        s.close();

        if(90 <= grade && grade <= 100){
            System.out.println("Your scored grade A");
        }
        else if(80 <= grade && grade <= 89){
            System.out.println("Your scored grade B");
        }
        else if(70 <= grade && grade <= 79){
            System.out.println("Your scored grade C");
        }
        else if(60 <= grade && grade <= 69){
            System.out.println("Your scored grade D");
        }
        else if(0 < grade && grade <= 59){
            System.out.println("You Failed in Exam!! You scored grade F");
        }
        else{
            System.out.println("Invalid grade entered!");
        }

        s.close();
    }
}