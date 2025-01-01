
import java.util.Scanner;

class Employee{
    int empid;
    String name;
    
    
    void get(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Employee Id: ");
        empid = s.nextInt();
        System.out.println("Enter Employee Name: ");
        name = s.next();
    }

    void display(){
        System.out.println(empid + " " + name);
    }

    void sort(Employee k[]){
        Employee temp = new Employee();
        for (int i = 0; i < k.length; i++) {
            
        }

    }
}

public class Employee_Object {
    
}
