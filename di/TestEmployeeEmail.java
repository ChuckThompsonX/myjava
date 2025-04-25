package myjava.di;

public class TestEmployeeEmail {

	public static void main(String... args) {
		
		// without DI
		
		Employee e1 = new Employee();
		e1.sendEmail("This is my first message.");
		
		// with DI 

		Email email = new Email();
		Employee e2 = new Employee(email);
		e2.sendEmail("This is my second email.");
	}

}
