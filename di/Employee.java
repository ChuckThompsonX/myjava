package myjava.di;

public class Employee {

	private Email email;
	
	public Employee() {
		this.email = new Email();
	}

	public Employee(Email email) {
		this.setEmail(email);
	}

	public void sendEmail(String message) {
		this.email.sendMessage(message);
	}
	
	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}
}
