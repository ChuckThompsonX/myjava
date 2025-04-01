package myjava.cloning.copy;

// The Cloneable interface in Java is a marker interface. 
// i.e. it doesn't contain any methods but serves as a signal to the JRE that the class allows for field-for-field copying of instances. 
// When a class implements Cloneable, it indicates that it supports the creation of a copy through the clone() method.
// https://medium.com/@pratik.941/understanding-the-cloneable-interface-shallow-copy-and-deep-copy-in-java-73c45066ecb1

// 1. Implement the Cloneable interface in your class.
// 2. Override the clone() method from the Object class.
// 3. Call super.clone() inside the clone() method.

class Person implements Cloneable {

	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}

	public static void main(String... args) {
		try {
			Person original = new Person("Alice", 30);
			Person cloned = (Person) original.clone();

			System.out.println("Original: " + original);
			System.out.println("Cloned: " + cloned);
		} 
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
