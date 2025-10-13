
public class VehicleService {

	public static void main(String[] args)
	{
		
		
		Car c = new Car();
		c.brand = "Honda";
		c.speed = 120;
		c.seatingCapacity = 4;
		
		/*
		System.out.println(c.brand);
		System.out.println(c.speed);
		System.out.println(c.seatingCapacity);
		*/
		
		
		c.displayInfo();
		c.showDetails();
		
	}
	
}


class Vehicle{
	
	
	String brand;
	int speed;
	
	
	public void displayInfo()
	{
		System.out.println("Brand :"+brand);
		System.out.println("Speed :"+speed);
	}
}


class Car extends Vehicle {
	
	int seatingCapacity;
	
	public void showDetails()
	{
		System.out.println("Seating Capacity :"+seatingCapacity);
		
	}
}