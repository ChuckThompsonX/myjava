/**
 * Robot
 */
package com.java.strategy;

/**
 * @author Chuck
 *
 */
public class Robot {

	private IBehavior behavior;
	
	/**
	 * 
	 */
	public Robot() {
	}

	/**
	 * @return the behavior
	 */
	public IBehavior getBehavior() {
		return behavior;
	}

	/**
	 * @param behavior the behavior to set
	 */
	public void setBehavior(IBehavior behavior) {
		this.behavior = behavior;
	}

	/**
	 * 
	 */
	public void move() {
		this.behavior.move();
	}
}
