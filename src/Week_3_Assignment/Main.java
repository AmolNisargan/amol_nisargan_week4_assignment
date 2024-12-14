package Week_3_Assignment;

/*Create a base class Vehicle and derived classes
Car and Bike. Implement method overriding and
demonstrate polymorphism.
1.*/
// Base class
class Vehicle {
	protected String name;
	protected int maxSpeed;

	// Constructor
	public Vehicle(String name, int maxSpeed) {
		this.name = name;
		this.maxSpeed = maxSpeed;
	}

	// Method to describe the vehicle
	public String description() {
		return name + " can go up to " + maxSpeed + " km/h.";
	}

	// Method to start the vehicle
	public String start() {
		return name + " is starting.";
	}
}

// Derived class Car
class Car extends Vehicle {
	private int doors;

	// Constructor
	public Car(String name, int maxSpeed, int doors) {
		super(name, maxSpeed);
		this.doors = doors;
	}

	// Overriding description method
	@Override
	public String description() {
		return name + " (Car) with " + doors + " doors can go up to " + maxSpeed + " km/h.";
	}

	// Overriding start method
	@Override
	public String start() {
		return name + " (Car) is starting with a roar.";
	}
}

// Derived class Bike
class Bike extends Vehicle {
	private String type;

	// Constructor
	public Bike(String name, int maxSpeed, String type) {
		super(name, maxSpeed);
		this.type = type;
	}

	// Overriding description method
	@Override
	public String description() {
		return name + " (Bike), which is a " + type + ", can go up to " + maxSpeed + " km/h.";
	}

	// Overriding start method
	@Override
	public String start() {
		return name + " (Bike) is starting with a vroom.";
	}
}

// Main class to demonstrate polymorphism
public class Main {
	public static void startVehicle(Vehicle vehicle) {
		System.out.println(vehicle.start());
		System.out.println(vehicle.description());
	}

	public static void main(String[] args) {
		// Create instances of Car and Bike
		Vehicle car = new Car("Sedan", 200, 4);
		Vehicle bike = new Bike("Sports Bike", 150, "sport");

		// Use polymorphism
		startVehicle(car); // Car-specific start and description methods will be used
		startVehicle(bike); // Bike-specific start and description methods will be used
	}
}
