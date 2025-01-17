package myjava.designpatterns.factory;

public enum Shape {
	
	CIRCLE("CIRCLE"),
	SQUARE("SQUARE");

	String shape;

	Shape(String shape) {
		this.shape = shape;
	}
	
	public String shape() {
		return this.shape;
	}
	
	public static Shape fromShape(String shape) {
		if (!shape.isBlank()) {
			for (Shape s : values()) {
				if (s.shape().equals(shape)) {
					return s;
				}
			}
		}
		return null;
	}
}
