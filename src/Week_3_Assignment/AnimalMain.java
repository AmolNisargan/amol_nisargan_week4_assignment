package Week_3_Assignment;

/*Develop a simple program to demonstrate the
concept of abstract classes and interfaces.
3.*/
//Abstract class
abstract class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	// Abstract method
	public abstract void sound();

	// Concrete method
	public void sleep() {
		System.out.println(name + " is sleeping.");
	}
}

//Interface
interface Pet {
	void play();
}

//Dog class that extends Animal and implements Pet
class Dog extends Animal implements Pet {
	public Dog(String name) {
		super(name);
	}

	// Implementing the abstract method from Animal
	@Override
	public void sound() {
		System.out.println(name + " says: Woof Woof!");
	}

	// Implementing the play method from Pet
	@Override
	public void play() {
		System.out.println(name + " loves to play fetch!");
	}
}

//Cat class that extends Animal and implements Pet
class Cat extends Animal implements Pet {
	public Cat(String name) {
		super(name);
	}

	// Implementing the abstract method from Animal
	@Override
	public void sound() {
		System.out.println(name + " says: Meow Meow!");
	}

	// Implementing the play method from Pet
	@Override
	public void play() {
		System.out.println(name + " loves to play with a ball of yarn!");
	}
}

//Main class to demonstrate the program
public class AnimalMain {
	public static void main(String[] args) {
		// Create Dog and Cat objects
		Dog dog = new Dog("Buddy");
		Cat cat = new Cat("Whiskers");

		// Demonstrate functionality
		dog.sound(); // Abstract method from Animal
		dog.play(); // Method from Pet interface
		dog.sleep(); // Concrete method from Animal

		System.out.println();

		cat.sound(); // Abstract method from Animal
		cat.play(); // Method from Pet interface
		cat.sleep(); // Concrete method from Animal
	}
}
