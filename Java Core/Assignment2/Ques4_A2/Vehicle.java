package Capg;

abstract class Vehicle {
 private String name;
 
 public Vehicle(String name) {
	 this.name=name;
	 
 }
 public abstract void move();
}
class Car extends Vehicle{
	
	public Car(String name) {
	
	super(name);
	
	}
	public void move() {
		
		System.out.println("Car accelerates");
		
	}
}

 class Aeroplane extends Vehicle{
	 
	 public Aeroplane(String name)
	 {
		 super(name);
	 }
	 public void move() {
		 System.out.println("Aeroplane flies");
	 } 
  }


