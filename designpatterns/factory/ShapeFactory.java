package design.patterns.factory;

// factory class
class ShapeFactory {
	
	public IShape getShape(Shape shape) {

		switch (shape) {
			case Shape.CIRCLE: 
				return new Circle();
			case Shape.SQUARE:
				return new Square();
			default:
				return null;
		}
	}
}
