package myjava.cloning.deepcopy;

// A deep copy duplicates everything directly or indirectly referenced by the fields in the original object. 
// This means the cloned object does not share references with the original object; it creates a completely independent copy.

class Address implements Cloneable {
	String city;

	Address(String city) {
		this.city = city;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// here is a difference: clone override is added to this sub-reference
		return super.clone();
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
		Person cloned = (Person) super.clone();
		// here is a difference: sub-reference is cloned too
		cloned.address = (Address) address.clone();
		return cloned;
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
			// modify the address in the cloned object does not modify address for the original object
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
