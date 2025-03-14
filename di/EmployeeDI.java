package myjava.di;

public class EmployeeDI {

	private Email email;
	
	public EmployeeDI(Email email) {
		this.email = email;
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
