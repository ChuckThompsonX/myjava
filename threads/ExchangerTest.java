package threading;

import java.util.concurrent.Exchanger;

public class ExchangerTest {

	public static void main(String... args) {
		
		// synchronization construct that allows two threads to exchange objects at a rendezvous point
		// it's a way to facilitate direct hand off of data between threads
		
		Exchanger<String> exchanger = new Exchanger<>();

		Thread thread1 = new Thread(() -> {
			try {
				// each thread calls the exchange() method on the Exchanger object, passing in the object it wants to exchange
				String receivedMessage = exchanger.exchange("Hello from Thread 1");
				System.out.println("Thread 1 received: " + receivedMessage);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread thread2 = new Thread(() -> {
			try {
				// the exchange() method blocks until another thread calls exchange() on the same Exchanger object
				// blocked - a thread enters the blocked state when it's trying to access a resource currently being held by another thread
				String receivedMessage = exchanger.exchange("Hello from Thread 2");
				System.out.println("Thread 2 received: " + receivedMessage);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		// once both threads have reached the rendezvous point, they exchange their objects
		// and each thread receives the object from the other thread
		
		thread1.start();
		thread2.start();
		
		/*	Scenarios:
			Producer-consumer - when a producer thread generates data and a consumer thread processes it, 
			the Exchanger can be used to hand off data directly between them, avoiding the need for a shared buffer
			Parallel algorithms - where threads need to exchange intermediate results
		 */
	}
}
