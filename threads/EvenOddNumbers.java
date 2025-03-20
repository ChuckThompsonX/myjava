package threading;

public class EvenOddNumbers {

	private static final int MAX_NUMBER = 10;
	private static final Object lock = new Object();
	private static boolean isEvenTurn = true;

	public static void main(String[] args) {

		Thread evenThread = new Thread(() -> {
			for (int i = 2; i <= MAX_NUMBER; i += 2) {
				// synchronized block requires an object to act as the monitor
				// thread executing block acquires the lock on said monitor
				// then releases it upon exiting
				synchronized (lock) {
					while (!isEvenTurn) {
						try {
							System.out.println("Even thread waiting");
							// release lock and enter waiting state
							// and remain in this state until another thread calls notify()
							lock.wait();
						} catch (InterruptedException e) {
							System.out.println(e.getMessage());
						}
					}
					System.out.println("Even Number from evenThread: " + i);
					isEvenTurn = false;
					// signal to a waiting thread that the condition it was waiting for might have been met
					lock.notify();
				}
			}
		});

		Thread oddThread = new Thread(() -> {
			for (int i = 1; i <= MAX_NUMBER; i += 2) {
				// synchronized block requires an object to act as the monitor
				// thread executing block acquires the lock on said monitor
				// then releases it upon exiting
				synchronized (lock) {
					while (isEvenTurn) {
						try {
							System.out.println("Odd thread waiting");
							// release lock and enter waiting state
							// and remain in this state until another thread calls notify()
							lock.wait();
						} catch (InterruptedException e) {
							System.out.println(e.getMessage());
						}
					}
					System.out.println("Odd Number from oddThread: " + i);
					isEvenTurn = true;
					// signal to a waiting thread that the condition it was waiting for might have been met
					lock.notify();
				}
			}
		});

		evenThread.start();
		oddThread.start();
	}
}
