package pack1;

public class practice2 extends practice1
{		
	public static void main(String[] args) 
	{		
		practice2 pr2;
		pr2= new practice2();
		//pr2= (practice2) new practice1();
		pr2.bike();
		pr2.jones();
		pr2.lalitha();
		pr2.manoj();
	
		
	}
	
	private void bike() 
	{
		System.out.println("Ninja");

	}
	
	@Override
	public void manoj() 
	{				
		System.out.println("Manoj From Erode");
	}
	
	public void lalitha() 
	{
		System.out.println("Hi");
	}
	
	public void jones() 
	{
		System.out.println("Hi");
	}
}
