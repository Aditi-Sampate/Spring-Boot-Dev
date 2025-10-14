
public class Construct {

	public static void main(String[] args) {
		
		Employee e = new Employee("aditi",20);
		
		
	}
}


class Employee
{
	
	  int age;
	  String name;
	
	
	public Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
		
		
		System.out.println("Name :" +name );
		System.out.println("Age :"+age);
	}
	
	
}

/* What is Constructor
 * 
 *    Constructor is a special type of method without return type.
 *    we use Constructor to create Object & to initialize  the state of variable.
 *
 *  */