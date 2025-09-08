package day5_oops_Basics;

// Parent class
class Vehicle {
	String brand;
	int speed;

	void drive() {
		System.out.println(brand + " is driving at " + speed + " km/h.");
	}
}

// Child class 1
class Car1 extends Vehicle {
	int numOfDoors;

	void showCarDetails() {
		System.out.println(brand + " has " + numOfDoors + " doors.");
	}
}

// Child class 2
class Bike extends Vehicle {
	boolean hasKickStart;

	void showBikeDetails() {
		if (hasKickStart)
			System.out.println(brand + " bike has a kick start.");
		else
			System.out.println(brand + " bike has only self-start.");
	}
}

// Main class
public class Inheritence_Example {
	public static void main(String[] args) {
		// Car object
		Car1 car = new Car1();
		car.brand = "BMW";
		car.speed = 180;
		car.numOfDoors = 4;
		car.drive();
		car.showCarDetails();

		// Bike object
		Bike bike = new Bike();
		bike.brand = "Royal Enfield";
		bike.speed = 120;
		bike.hasKickStart = true;
		bike.drive();
		bike.showBikeDetails();
	}
}
