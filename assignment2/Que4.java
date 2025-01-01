
import java.util.Scanner;

//4 wap to ask 7 names from user in string array and search for particular name in given array using for loop.

public class Que4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String names[] = new String[7];

        System.out.println("Enter 7 names: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name " + (i+1) + " : ");
            names[i] = s.nextLine();
        }

        System.out.println("Enter name you want to search for: ");
        String searchName = s.nextLine();

        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(searchName)){
                found = true;
                System.out.println(searchName + " is found at position " + (i+1));
                break;
            }
        }

        if(!found){
            System.out.println(searchName + " is not found in list.");
        }

        s.close();
    }
}