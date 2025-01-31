package com.java.strategy;

import java.util.Random;

public class TestRobots {

	public static void main(String[] args) {

		Robot r1 = new Robot();
		Robot r2 = new Robot();
		Robot r3 = new Robot();
		
		r1.setBehavior(new Defensive());
		r2.setBehavior(new Aggressive());
		r3.setBehavior(new Submissive());

		Random randomGenerator = new Random();
		
		for (int i = 0; i < 10; i++) {
			int randomInt = randomGenerator.nextInt(3);
			
			switch (randomInt) {
			case 0:
				r1.move();
				break;
			case 1:
				r2.move();
				break;
			case 2:
				r3.move();
				break;
			default:
				System.out.println("Default move.");
				break;
			}
		}
	}

}
