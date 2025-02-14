package myjava.interfaces;

public class TestExtendMe implements IExtendTestMe {

	public void printMe() {
		System.out.println("Test");
	}
	
	public int computeMe() {
		return 2 * 5;
	}
	
	public int computeMeToo(int x) {
		return x * 2;
	}

}
