package myjava.di;

public class Email {

	private String message;
	
	public Email() {
		// TODO Auto-generated constructor stub
	}

	public void sendMessage(String message) {
		this.setMessage(message);
		// SMTP send message
		System.out.println("Sent message " + message);
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
