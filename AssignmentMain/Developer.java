package basicjava;
	public class Developer extends Employee{
		private String programingLanguage;
		
		public Developer(String name, int employeeId, double salary,String programingLanguage) {
			super(name, employeeId, salary);
			this.programingLanguage=programingLanguage;
		}
		public String getprogramingLanguage() {
	    	return programingLanguage;
	    }
	    
	    public void setdepartment(String programingLanguage) {
	    	this.programingLanguage=programingLanguage;
	    }
	}


