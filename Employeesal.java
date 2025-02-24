package non_static;

public class Employeesal {
    int employeeId;
    String employeeName;
    double salary;
    public void setEmployeeId(int eId){
         employeeId=eId;
     }
    public void setEmployeeName(String eName){
        employeeName=eName;
     }
    public void setSalary(double sal){
              salary=sal;
     }
   public int getEmployeeId() {
	 return employeeId;
   }
   public String getEmployeeName() {
	return employeeName;
    }
      public double getSalary() {
	  return salary;
   }
public String displayDetails(){
    return "ProductId: "+getEmployeeId()+"\nProductName: "+getEmployeeName()+"\nProductPrice: "+getSalary();
}
}
