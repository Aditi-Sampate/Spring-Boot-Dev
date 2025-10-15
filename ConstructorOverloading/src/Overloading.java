
public class Overloading {

	public static void main(String[] args) {
		
		Student s = new Student("aditi",20,'c');
		
	}
}


class Student{
	
	String name;
	int rollno;
	char div;
	long mobileno;
	
	
	public Student(String name)
	{	
		this.name = name;	
		System.out.println("Name :" + name);
		
	}
	
	public Student(String name,int rollno)
	{	
		this.name = name;
		this.rollno = rollno;
			
		
		System.out.println("Name :" + name + "Roll No :" + rollno);
	}
	
	public Student(String name,int rollno,char div) 
	{
		this.name = name;
		this.rollno = rollno;
		this.div = div;
		
		System.out.println("Name :" + name + "Roll No :" + rollno + "Div :" + div);
	}
	
	public Student(String name,int rollno,char div,long mobileno) 
	{
		this.name = name;
		this.rollno = rollno;
		this.div = div;
		this.mobileno = mobileno;
		
		System.out.println("Name :" + name + "Roll No :" + rollno + "Div :" + div + "Mobile No :" + mobileno);
	}
	
		
}

/*  Constructor Overloading
 * When we have multiple constructor within same class but different parameter
 * is known as Constructor Overloading.
 */
