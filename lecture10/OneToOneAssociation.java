// Q 2 write a program to demonstrate one to many association using Employee class and Department class 
// hint  class Employee { .....}

// class Department {
// List<Employee> l;

class Department{
    private int deptId;
    private String deptName;

    public Department(int deptId, String deptName){
        this.deptId = deptId;
        this.deptName = deptName;
    }

    @Override
    public String toString(){
        return "DepartmentId = " + deptId + ", Department Name = " + deptName;
    }
}

class Emp{
    private int empId;
    private String empName;
    private String deptName;

    public Emp(int empId, String empName, String deptNAme){
        this.empId = empId;
        this.empName = empName;
        this.deptName = deptNAme;
    }

    @Override
    public String toString(){
        return "Employee"
    }
}

public class OneToOneAssociation {
    
}
