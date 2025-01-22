/**
 * Comparable interface is for natural ordering.
 * Implemented in Wrapper classes, String & Enum.
 */
package myjava.comparable;

public class Person implements Comparable<Person> {

	private int id;

	public Person(int id) {
		this.id = id;
	}
	
	@Override
	public int compareTo(Person p) {		
		return this.id - p.id;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
}
