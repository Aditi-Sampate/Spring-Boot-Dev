
public class Company {

	public static void main(String[] args)
	{
		Manager m = new Manager();
		m.name = "Aditi";
		m.age = 21;
		m.empId = 1212;
		m.salary = 30000;
		m.Department= "IT";
		
		
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.empId);
		System.out.println(m.salary);
		System.out.println(m.Department);
		
		
		
	}
}


class Person
{
	
	String name;
	int age;
}

class Employee extends Person
{
	int empId;
	double salary;
}

class Manager extends Employee
{
	String Department;
}

