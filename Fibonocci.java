package pack1;

public class Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 0, c = 1;

        for(int i=1; i<=10; i++)

        {

            System.out.println(b);

            int num = b+c;

            b=c;

            c=num;
        }


	}

}
