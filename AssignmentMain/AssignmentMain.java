package basicjava;
import basicjava.employees.*;
import basicjava.utilities.*;
public class AssignmentMain {
		public static void main(String[] args) {
			Manager m=new Manager("Alice",101,80000,"developer");
			Developer d=new Developer("bob",200,180000,"java");
			System.out.println(m.getName());
			System.out.println(m.getemployeeId());
			System.out.println(m.getsalary());
			System.out.println(m.getdepartment());
			System.out.println(d.getName());
			System.out.println(d.getemployeeId());
			System.out.println(d.getsalary());
			System.out.println(d.getprogramingLanguage());
			
			EmployeeUtilities e=new EmployeeUtilities();
			e.demo();
			System.out.println(e);
		}

	}