package test;

import java.util.concurrent.TimeUnit;

public class LambdaThread {

	public static void main(String[] args) {
		
		System.out.println("Test Lambda Thread Start");
		
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				
				System.out.println(i);
				
				try {
					TimeUnit.SECONDS.sleep(1);
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(r).start();
		
		System.out.println("Test Lambda Thread End");
	}
}
