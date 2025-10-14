
public class Service {

	public static void main(String[] args)
	{
		
		Customer c1 = new Customer();
		c1.name = "Aditi";
		c1.address = "Latur";
		c1.email = "a@gmail.com";
		c1.mobileno = 1234567896;
		c1.otp = 13443;
		
		
		Order c2 =  new Order();
		c2.name = "xyz";
		c2.address = "Latur";
		c2.email = "a@gmail.com";
		c2.productname = "facewash";
		c2.productprice = 150;
		
	
		
		
		AmazonService as = new AmazonService();
		
		String s = as.accountCreated(c1);
		System.out.println(s);
		
		String o = as.orderConfirmed(c2);
		System.out.println(o);
		
	}
	
}


class Customer{
	
	String name;
	String address;
	String email;
	double mobileno;
	int otp;
	
}


class Order{
	
	String name;
	String address;
	String email;
	String productname;
	int productprice;
	
}

class AmazonService{
	
	String accountCreated(Customer c1) {
		return "Your Account is Created";
		
	}
	
	
	String orderConfirmed(Order c2) {
		
		return " Your order is confirmed";
			
	}
	
}



	

