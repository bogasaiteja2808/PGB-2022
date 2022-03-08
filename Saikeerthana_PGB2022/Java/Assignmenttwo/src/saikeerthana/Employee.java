package saikeerthana;
public class Employee {

	private String empname;
	private int empid;
	
	 public Employee(String empname, int empid) {
			super();
			this.empname = empname;
			this.empid = empid;
			
			
		}
		public String getName() {
			return empname;
		}
	 
		public void setName(String empname) {
			this.empname = empname;
		}
	 
		public int getId() {
			return empid;
		}
	 
		public void setId(int empid) {
			this.empid = empid;
		}	
		
		public void overload(Employee en)
		{
			System.out.println(en.getName());
		}
		public void overload()
	{
			System.out.println("overload without args");
		}
		
		
	 
		@Override
		public String toString() {
			return this.getId() + "-" + this.getName();
		}
	 
		@Override
		public int hashCode() {
			return this.empid;
		}
		@Override
		public boolean equals(final Object obj) {
			if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        final Employee siteObject = (Employee) obj;
	        if(this.getName() == siteObject.getName() && 
	        		this.getId() == siteObject.getId())
	        	return true; 
	        else
	        	return false;
		}	
	 public Employee() {
		 
	 }
	 
	 
	
}

