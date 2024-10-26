package pack1;

public class Person 
{
	private int mobilenumber;
	
	private String Name;
	
	public String getName()
	{
		return Name;
	}
	public void setName(String newName)
	{
		this.Name = newName;
	}
	
	public int getmobilenumber()
	{
		return mobilenumber;
	}
	public void setmobilenumber(int mobilenumber)
	{
		
		this.mobilenumber = mobilenumber;
	}
	
	public static void main(String[] args)
	{
		Person myObj = new Person();
		myObj.setName("Manoj");
		myObj.setmobilenumber(987456123);
		System.out.println(myObj.getmobilenumber()+";"+myObj.getName());
	}


}
