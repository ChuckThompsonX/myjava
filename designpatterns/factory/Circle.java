package myjava.designpatterns.factory;

// concrete product
class Circle implements IShape {
	
	public void draw() {
		System.out.println("Draw circle");
	}
}
