package myjava.threads.deadlock;

public class TestThreads {

	public static void main(String args[]) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		ThreadA tA = new ThreadA(obj1, obj2);
		ThreadB tB = new ThreadB(obj1, obj2);
		
		tA.start();
		tB.start();
	}
}
