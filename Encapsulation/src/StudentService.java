
public class StudentService {

	public static void main(String[] args)
	{
		
		Student s = new Student();
		s.setName("Aditi");
		s.setRollno(77);
		s.setMarks(89);
		
		
		System.out.println("Name :"+s.getName());
		System.out.println("Roll No :"+ s.getRollno());
		System.out.println("Marks :"+ s.getMarks());
		
		
	}
	
	
}


class Student{
	
	private String name;
	private int rollno;
	private int marks;
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public int getRollno()
	{
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	
	
	public int getMarks()
	{
		return marks;
	}
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	
	
}


