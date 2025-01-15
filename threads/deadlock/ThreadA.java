package myjava.threads.deadlock;

public class ThreadA extends Thread {
	
	private Object obj1;
	
	private Object obj2;
	
	/**
	 * 
	 * @param obj1
	 * @param obj2
	 */
	ThreadA(Object obj1, Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	/**
	 * 
	 */
	public void run() {
		synchronized (obj1) {
			System.out.println("ThreadA: Holding lock 1...");
			System.out.println("ThreadA: Waiting for lock 2...");
			
			// Already inside 1 now we want 2
			synchronized (obj2) {
				System.out.println("ThreadA: Holding lock 1 & 2...");
			}
		}
	}
}
