package myjava.threads;

import java.util.concurrent.Executors;

public class VirtualThreads {

	public static void main(String... args) throws InterruptedException {
		
		// create and start vthread
		Thread virtualThread = Thread.ofVirtual().start(() -> {
			System.out.println(Thread.currentThread());
		});

		// waiting for the vthread to complete
		virtualThread.join();

		// creates a new vthread for each submitted task
		try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
			
			for (int i = 1; i <= 5; i++) {
				
				final int taskNumber = i;
				
				executor.submit(() -> {
					System.out.println("Task " + taskNumber + " running in virtual thread: " + Thread.currentThread());
				
					try {
						// simulate some process here
						Thread.sleep(100);
					} 
					catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				});
			}
		} // try-with-resources ensures ExecutorService is closed automatically
	}
}
