package basicjava;
public class Employee {
	private String name;
	private int employeeId;
	private double salary;
	
	public Employee(String name,int employeeId,double salary){
		this.name=name;
		this.employeeId=employeeId;
		this.salary=salary;
	}
    public String getName() {
    	return name;
    }
    
    public int getemployeeId() {
    	return employeeId;
    }
    
    public double getsalary() {
    	return salary;
    }
    
    public void setName(String name) {
    	this.name=name;
    }
    
    public void setemployeeId(int employeeId) {
    	this.employeeId=employeeId;
    }
    
    public void setsalary(double salary) {
    	this.salary=salary;
    }
    
	
}