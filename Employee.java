package pack1;

public class Employee
{
	private String Name;
	Employee(String string, int id) 
	{
		//constructor default
		 this.Name = string;
	        System.out.println("I am a default Constructor");
		System.out.println("EmployeeName:"+Name+"\n"+"Employeeid:"+id);
	}
	public static class EmployeeData
	{
		public static void main(String[] args) 
		{
		   new Employee("manoj",105);
			//calling constructor
			
		}
		
	}
}