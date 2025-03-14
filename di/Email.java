package myjava.di;

public class Email {

	private String message;
	
	public Email() {
	}

	public void sendMessage(String message) {
		this.setMessage(message);
		// SMTP send message
		System.out.println("Sent message " + message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
