package basicjava;

public class Manager extends Employee{
	private String department;

	public Manager(String name, int employeeId, double salary,String department) {
		super(name, employeeId, salary);
		this.department=department;
	}
	
    public String getdepartment() {
    	return department;
    }
    
    public void setdepartment(String department) {
    	this.department=department;
    }

}
