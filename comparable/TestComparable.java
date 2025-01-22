package myjava.comparable;

public class TestComparable {

	public static void main(String... args) {

		Person p1 = new Person(2);
		Person p2 = new Person(5);
		
		int c1 = p1.compareTo(p2);		
		System.out.println(c1);

		int c2 = p2.compareTo(p1);		
		System.out.println(c2);
	}
}
