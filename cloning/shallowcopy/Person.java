package myjava.cloning.shallowcopy;

// A shallow copy of an object copies all the member fields, but it does not copy objects that the fields refer to. 
// Instead, the references to these objects are copied, meaning both the original and the copied object refer to the same objects.
// In Java, the clone() method creates a shallow copy by default.

class Address {
	String city;

	Address(String city) {
		this.city = city;
	}
}

class Person implements Cloneable {
	String name;
	int age;
	Address address;

	Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + ", address=" + address.city + "}";
	}

	public static void main(String[] args) {
		try {
			Address address = new Address("New York");
			Person original = new Person("Alice", 30, address);
			Person cloned = (Person) original.clone();
			System.out.println("Original: " + original);
			System.out.println("Cloned: " + cloned);
			// modify the address in the cloned object, modifies it for the original object too
			cloned.address.city = "Los Angeles";

			System.out.println("After modifying cloned object:");
			System.out.println("Original: " + original);
			System.out.println("Cloned: " + cloned);
		} 
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
