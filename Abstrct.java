package pack1;

public class Abstrct extends Abstract
{

	@Override
	void bankdetails() {
		String a ="Acc name = Manoj";
		System.out.println(a);
		
	}

	@Override
	void userid() {
		String b ="UserId = 12345Man";
		System.out.println(b);
		
	}

	@Override
	void password() {
		String c ="Password = Man123";
		System.out.println(c);
		
		
	}
	public static void main(String[] args) {
		Abstrct ab = new Abstrct();
		ab.userid();
		ab.bankdetails();
		ab.password();
	}

		
	}
	



