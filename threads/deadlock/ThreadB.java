package myjava.threads.deadlock;

public class ThreadB extends Thread {
	
	private Object obj1;
	
	private Object obj2;
	
	ThreadB(Object obj1, Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void run() {
		synchronized (obj2) {
			System.out.println("ThreadB: Holding lock 2...");
			System.out.println("ThreadB: Waiting for lock 1...");
			
			// already inside 2 now we want 1
			synchronized (obj1) {
				System.out.println("ThreadB: Holding lock 2 & 1...");
			}
		}
	}
}
