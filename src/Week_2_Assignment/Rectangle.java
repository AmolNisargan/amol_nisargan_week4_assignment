package Week_2_Assignment;

public class Rectangle {
	double length;
	double width;

	public Rectangle(double side) {
		this.length = side;
		this.width = side;
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calculateAria() {
		return length * width;
	}

	public double calculateAria(double length, double width) {
		System.out.println("length: " + length);
		System.out.println("width: " + width);
		return length * width;
	}

	public void display() {
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Aria: " + calculateAria());
	}

	public static void main(String[] args) {

		Rectangle square = new Rectangle(10);
		System.out.println("Area Of Square: ");
		square.display();
		System.out.println("-----------------");
		Rectangle rectangle = new Rectangle(20, 30);
		System.out.println("Aria of Rectangle: ");
		rectangle.display();
		System.out.println("-----------------");
		System.out.println("Custom Aria of Rectangle: " + rectangle.calculateAria(5, 10));
		System.out.println("-----------------");
	}

}
