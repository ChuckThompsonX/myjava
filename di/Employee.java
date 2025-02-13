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
	
	/**
	 * @return the email
	 */
	public Email getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(Email email) {
		this.email = email;
	}
	
	
}
