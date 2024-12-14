package Week_2_Assignment;
/*Create a class Person with attributes like name,
age, and methods to display these attributes.*/
public class Person {
	private String name;
	private int age;

	Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {
		System.out.println("Peson Details: ");
		Person person = new Person("Ajay Kumar", 30);
		person.display();
	}
}
