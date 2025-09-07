package day5_oops_Basics;

//Define a class
class Car{
	
	//Attributes(States)
	String brand;
	String color;
	int speed;
	
	//Behavior (Methods)
	void drive() {
		System.out.println(brand + " is driving at the speed of " + speed + " km/h.");
	}
	
	void applyBreak() {
		System.out.println(brand + " has stopped!");
	}
}
public class ClassAndObjectExample {

	public static void main(String[] args) {
		// Create the first object
		Car car1 = new Car();
		car1.brand = "BMW M5";
		car1.color = "Red";
		car1.speed = 130;
		
		//Create second object
		
		Car car2 = new Car();
		car2.brand = "Volkswagen Polo";
		car2.color = "Matt Black";
		car2.speed = 100;
		
		// Call methods from first object
		car1.drive();
		car1.applyBreak();
		
		// Call methods from second object
		car2.drive();
		car2.applyBreak();

	}

}
