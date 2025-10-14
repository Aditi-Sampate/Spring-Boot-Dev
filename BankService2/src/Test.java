
public class Test {

	public static void main(String[] args)
	{
		Customer c1 = new Customer();
		c1.name = "amar";
		c1.address = "Pune";
		c1.email = "A@gmail.com";
		c1.age = 24;
		
		
		BankService bs = new BankService();
		String s = bs.openAccount(c1);
		
		System.out.println(s);
		
	}
}


class Customer{
	
	String name;
	String address;
	String email;
	int age;
	
}

class BankService{
	
	String openAccount(Customer c1) {
		
		return "Your account is Opened";
	}
}

