package com.java.strategy;

public class Robot {

	private IBehavior behavior;
	
	public Robot() {
	}

	public IBehavior getBehavior() {
		return behavior;
	}

	public void setBehavior(IBehavior behavior) {
		this.behavior = behavior;
	}

	public void move() {
		this.behavior.move();
	}
}
