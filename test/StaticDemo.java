package myjava.test;

public class StaticDemo {

	public static final String name = "NAME";
	
	{
		System.out.println("HELLO");
	}
	
	static {
		show();
	}
	
	public StaticDemo() {
		System.out.println("CONSTRUCTOR");
	}
	
	public static void show() {
		System.out.println("MESSAGE");
	}
	
	public static void main(String... args) {
		
		System.out.println("MAIN");
		
		new StaticDemo();
		new StaticDemo();
	}
	
	static {
		System.out.println("STATIC BLOCK");
		System.out.println("StaticDemo.name = " + name);
	}
}

/*
static
- good for loading drivers
- initializing static members
- security
- logging
- some DB operations e.g. prepared SQL statement

MESSAGE
STATIC BLOCK
StaticDemo.name = NAME
MAIN
HELLO
CONSTRUCTOR
HELLO
CONSTRUCTOR
 */
