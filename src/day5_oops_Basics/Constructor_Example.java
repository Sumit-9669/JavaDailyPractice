package day5_oops_Basics;

/*
 * >>> Explanation:
 * 
 * A constructor is a special method in Java used to initialize objects.
 * 
 * >>> Key rules:
 * 
 * Same name as the class.
 * 
 * No return type (not even void).
 * 
 * Runs automatically when you create an object using new.
 * 
 * >>> Types of Constructors:
 * 
 * Default Constructor → Provided by Java if you don’t define one.
 * 
 * Parameterized Constructor → Allows passing values while creating the object.
 * 
 * Constructor Overloading → Multiple constructors with different parameter
 * lists.
 */
class Student {
	int id;
	String name;

	// Default constructor
	Student() {
		id = 0;
		name = "Unknown";
		System.out.println(" The default constructor called...");
	}

	// Parameterized constructor
	Student(int studentId, String studentName) {
		id = studentId;
		name = studentName;
		System.out.println(" Parameterized constructor called...");
	}

	// Method to display student info
	void display() {
		System.out.println("Student ID: " + id + ", Name: " + name);
	}
}

public class Constructor_Example {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();

		Student s2 = new Student(07, "Sumit");
		s2.display();

		Student s3 = new Student(111, "Amit");
		s3.display();

	}

}
