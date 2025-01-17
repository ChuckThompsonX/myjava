package myjava.designpatterns.factory;

// concrete product
class Square implements IShape {
	
	public void draw() {
		System.out.println("Draw square");
	}
}
