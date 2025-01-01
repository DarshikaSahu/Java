package com.assignment3;

// Q 7 wap to ask 6 employee record from  user using get and display method show record on console after performing sorting 
// on record on basis of employee id.
import java.util.Scanner;
//object of array type 

class Emp {

    int empid;
    String name;

    void get() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter employee id");
        empid = s.nextInt();
        System.out.println("enter employee name");
        name = s.next();

    }

    void display() {
        System.out.println(empid + "  " + name);
    }

    void sort(Emp k[]) {
        Emp temp = new Emp();
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k.length - 1 - i; j++) {
                if (k[j].empid > k[j + 1].empid) {
                    temp = k[j];
                    k[j] = k[j + 1];
                    k[j + 1] = temp;
                }
            }
        }
    }
}

public class Que7 {

    public static void main(String[] args) {
        Emp e[] = new Emp[6]; // here we are creating 6 references

        for (int i = 0; i < 6; i++) {
            e[i] = new Emp();
            e[i].get();

        }

        Emp k = new Emp();
        k.sort(e);

        for (int i = 0; i < 6; i++) {
            e[i].display();
        }
    }

}
