import java.util.PriorityQueue;

public class EmpRecord {
    public static void main(String[] args) {
        Employee e = new Employee("Chetan", 1234);
        Employee e1 = new Employee("deepak", 124);
        Employee e2 = new Employee("amit", 14);
        Employee e3 = new Employee("bina", 24);

        PriorityQueue<Employee> p = new PriorityQueue<>();
        p.add(e);
        p.add(e1);
        p.add(e2);
        p.add(e3);

        System.out.println(p);
    }
}
