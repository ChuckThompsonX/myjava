package myjava.serialize;

import java.io.Serializable;

/**
 * You only need to implement the Serializable interface, which is just a marker 
 * interface having no fields or methods to implement.  Serialization is implemented 
 * by ObjectInputStream & ObjectOutputStream (see SerializationUtility), and all that 
 * is needed is a wrapper to either save to file or send over the network.
 * 
 * @author chuck
 */
public class Employee implements Serializable {

	// serialVersionUID is not required to be generated, but helps when changes are made to the class
	// before deserialization occurs.  For example, any changes in Employee class will be compatible 
	// with the serialization process, otherwise, without serialVersionUID, any changes before 
	// deserialization will throw an InvalidClassException, local class incompatible error.

	// For example, possible changes consist of adding new variables to the serialized class, changed 
	// variables from transient to non-transient, and changed variables from static to non-static.
	// For all these changes to work, the class should have a serialVersionUID defined.
	private static final long serialVersionUID = -6470090944414208496L;

	private int id;
	private String name;
	private String password;
	// Note the transient variable salary. This won't be serialized, thus you won't see the saved value 
	// when you deserialize this object.
	transient private int salary;

	@Override
	public String toString() {
		return "Employee {id=" + this.id + ", name=" + this.name + ", salary=" + this.salary + "}";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
