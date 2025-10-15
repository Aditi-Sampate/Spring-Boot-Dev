
public class Test {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.m1("aditi");
		
	}
}


class Parent{
	
	void m1(int rollno)
	{
		System.out.println("Roll No : " + rollno );
	}
	
	
	void m1(String name) {
		System.out.println("Name :" +name);
	}
	
	
	void m1(long mobileno) {
		System.out.println("Mobile No :"+mobileno);
	}
	
}


/* In Method Overloading method name must be same,
 * input arguments compulsory different,
 * return type and access modifier can be anything.
 * 
 * 
 * 
 * Automatic Promotion:
 * B - Byte / char
 * S - Short
 * N - Int
 * L - Long
 * F - Float
 * D - Double
 * 
 */


