package day5_oops_Basics;

/*🔹 Explanation

Method Overriding happens when a child class (subclass) provides its own implementation of a method that is already defined in the parent class (superclass).

The method name, parameters, and return type must be the same.

It’s an example of Runtime Polymorphism → the JVM decides which method to call at runtime.

✅ Same method signature (name + parameters + return type)
✅ Different implementation in subclass
✅ Requires inheritance*/

//Parent class
class BaseVehicle {
	void start() {
		System.out.println("Vehicle is starting... ");
	}
}

//Child class car
class CarOverride extends BaseVehicle {
	@Override
	void start() {
		System.out.println("Car is starting with the key ignition...");
	}
}

class BikeOverride extends BaseVehicle {
	@Override
	void start() {
		System.out.println("Bike is starting with self-start...");
	}
}

//Main Class
public class MethodOverriding_Example {

	public static void main(String[] args) {

		// Objects of child
		BaseVehicle v1 = new CarOverride();
		BaseVehicle v2 = new BikeOverride();

		v1.start();
		v2.start();
	}

}
