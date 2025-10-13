
public class Test {

	public static void main(String[] args) {
		
		/*
		AccountService as = new AccountService();
		System.out.println(as.bankName);
		System.out.println(as.address);
		System.out.println(as.accounttype);
		
		as.printMBalance();    //500
		*/
		
		
	/*		
		SavingAccount sa = new SavingAccount();
		System.out.println(sa.bankName);
		System.out.println(sa.address);
		System.out.println(sa.accounttype);
		
		sa.printMBalance();   //1000
	*/
	
		CurrentAccount ca = new CurrentAccount();
		System.out.println(ca.bankName);
		System.out.println(ca.address);
		System.out.println(ca.accounttype);
		
		ca.printMBalance();   //5000
		
		
	}
}


class AccountService{
	
	String bankName = "SBI";
	String address = "Latur";
	String accounttype = "Account";
	
	
	public void printMBalance()
	{
		System.out.println("500");
	}
}


class SavingAccount extends AccountService{
	
	public void printMBalance() {
		System.out.println("1000");
	}
	
}

class CurrentAccount extends AccountService{
	
	public void printMBalance() {
		System.out.println("5000");
	}
}

