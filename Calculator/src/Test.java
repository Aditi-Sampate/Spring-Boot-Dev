// S O L I D
//SRP -> Single Class have Single Responsibility
//O -> Open for extension and closing for modification.


public class Test {

	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		
		int ad = c.add(100,100);
		System.out.println(ad);
		
		int sb = c.sub(500, 200);
		System.out.println(sb);
				
		
	}
}


class Calculator{
	
	int add(int a, int b)
	{
		return a + b;
	}
	
	int sub(int a, int b)
	{
		return a - b;
	}
}

