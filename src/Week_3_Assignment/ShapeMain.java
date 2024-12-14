package Week_3_Assignment;

/*Implement a Shape class with derived classes
Circle, Rectangle, and Triangle, each having a
method to calculate the area.*/
//Base class
abstract class Shape {
	// Abstract method to calculate area
	public abstract double calculateArea();
}

//Derived class Circle
class Circle extends Shape {
	private double radius;

	// Constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	// Overriding calculateArea method
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

//Derived class Rectangle
class Rectangle extends Shape {
	private double length;
	private double width;

	// Constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// Overriding calculateArea method
	@Override
	public double calculateArea() {
		return length * width;
	}
}

//Derived class Triangle
class Triangle extends Shape {
	private double base;
	private double height;

	// Constructor
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	// Overriding calculateArea method
	@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}
}

//Main class to demonstrate area calculation
public class ShapeMain {
	public static void printArea(Shape shape) {
		System.out.println("Area: " + shape.calculateArea());
	}

	public static void main(String[] args) {
		// Create instances of Circle, Rectangle, and Triangle
		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(4, 6);
		Shape triangle = new Triangle(3, 8);

		// Print areas using polymorphism
		printArea(circle); // Calculates and prints the area of the circle
		printArea(rectangle); // Calculates and prints the area of the rectangle
		printArea(triangle); // Calculates and prints the area of the triangle
	}
}
