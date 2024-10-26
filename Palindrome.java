package pack1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "Madam";
        String reversed = "";

        for(int i =0; i<original.length(); i++)
        {
            reversed=original.charAt(i)+reversed;
        }

        

        if(original.toLowerCase().equals(reversed.toLowerCase()))
	//if(original.equals(reversed))
        {
            

        System.out.println("Palindrome");

        }

        else
        {
            System.out.println("Not a Palindrome");
        }

	}

}
