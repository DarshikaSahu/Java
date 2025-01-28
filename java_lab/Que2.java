package java_lab;

// Create a class named Student with the following attributes:
// 1)      name (String): to store the name of the student.
// 2)      id (int): to store the student ID.
// 3)      grade (double): to store the grade of the student.
// Implement a constructor to initialize these attributes.
// è In the main method, create an array named studentArray that can hold up to 10 Student objects.
// è Initialize the studentArray array with different Student objects. You can use fictional student data for this.
// è Write a method named displayStudents that takes the studentArray array as a parameter and displays the details of each student 
// in the array.
// è Write a method named sortStudents that takes the studentArray array as a parameter and sorts the array based on the grades of 
// the students in ascending order. You can use any sorting algorithm of your choice (e.g., bubble sort )
class Student {

    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public void display() {
        System.out.println("Name: " + name + "," + " ID: " + id + "," + " Grade: " + grade);
    }
}

public class Que2 {

    public static void main(String[] args) {
        Student[] studentArray = new Student[10];

        studentArray[0] = new Student("Alice", 1, 85.5);
        studentArray[1] = new Student("Bob", 2, 92.0);
        studentArray[2] = new Student("Charlie", 3, 78.3);
        studentArray[3] = new Student("David", 4, 95.1);
        studentArray[4] = new Student("Eve", 5, 88.7);
        studentArray[5] = new Student("Devi", 6, 96.7);
        studentArray[6] = new Student("Eva", 7, 85.0);
        studentArray[7] = new Student("Ana", 8, 90.2);
        studentArray[8] = new Student("Bella", 9, 88.1);
        studentArray[9] = new Student("Ash", 10, 80.7);

        displayStudents(studentArray);

        sortStudents(studentArray);

        System.out.println("Students after sorting by Grade.\n");
        displayStudents(studentArray);
    }

    public static void displayStudents(Student[] students) {
        for (Student student : students) {
            if (student != null) {
                student.display();
            }
        }
    }

    public static void sortStudents(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (students[j].getGrade() > students[j + 1].getGrade()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
