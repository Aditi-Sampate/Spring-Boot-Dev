
public class Service {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.setName("Aditi");
		c1.setAddress("Latur");
		c1.setEmail("a@gmail.com");
		c1.setMobileno(1234567891);
		c1.setAge(25);
		
		BankService bs = new BankService();
		String msg = bs.openAccount(c1);
		System.out.println(msg);
	}
}


class Customer{
	
	private String name;
	private String address;
	private String email;
	private Long mobileno;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}


class BankService{
	
	
	public String openAccount(Customer c1)
	{
		if(c1.getAge()>18)
		{
			//System.out.println("Your age is " +c1.getAge());
			//System.out.println("Your account is opened");
			
			return "Your account is opened";
		}
		
		return "You are not eligible. Your account is not opened";
			
		
	}
	
}
