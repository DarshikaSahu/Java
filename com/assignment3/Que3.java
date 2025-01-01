package com.assignment3;

// Q 3 Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. 
// In this class the member functions are setdata and displaydata.
import java.util.Scanner;

class Room {

    Scanner s = new Scanner(System.in);
    int roomno;
    String roomtype;
    float roomarea;
    String ACmachine;

    void setdata() {
        System.out.println("Enter room number: ");
        roomno = s.nextInt();
        System.out.println("Enter room type: ");
        roomtype = s.next();
        System.out.println("Enter room area: ");
        roomarea = s.nextFloat();
        System.out.println("Is ACmachine available in the room? (Enter Yes or No: ");
        ACmachine = s.next();
    }

    void displaydata() {
        System.out.println("room number: " + roomno);
        System.out.println("room type: " + roomtype);
        System.out.println("room area: " + roomarea);
        System.out.println("Ac Machine available: " + ACmachine);
    }
}

public class Que3 {

    public static void main(String[] args) {
        Room r1 = new Room();
        r1.setdata();
        r1.displaydata();
    }

}
