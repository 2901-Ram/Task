package non_static;

public class EmployeeElc {

	public static void main(String[] args) {
		Employeesal ob1=new Employeesal();
        Employeesal obj2=new Employeesal();
        ob1.setEmployeeId(100);
        ob1.setSalary(80000.67);
        ob1.setEmployeeName("Ram_Kumar");
        System.out.println( ob1.displayDetails());
        System.out.println("-------------------------");
        obj2.setEmployeeId(100);
        obj2.setSalary(75000.78);
        obj2.setEmployeeName("Rakesh");
        System.out.println( obj2.displayDetails());
	}

}
