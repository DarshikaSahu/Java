public class Employee implements Comparable<Employee> 
{
String ename;
int empid;

public Employee(String ename, int empid) {
	super();
	this.ename = ename;
	this.empid = empid;
}

@Override
public String toString() {
	return "Emp [ename=" + ename + ", empid=" + empid + "]";
}

@Override
public int compareTo(Employee o) {
	 
	return Integer.compare(empid,o.empid);
}

}