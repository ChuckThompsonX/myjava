package myjava.designpatterns.factory;

// client code
public class FactoryPatternDemo {
	
    public static void main(String[] args) {
    	
        ShapeFactory shapeFactory = new ShapeFactory();

        IShape shape = shapeFactory.getShape(Shape.CIRCLE);
        shape.draw();

        shape = shapeFactory.getShape(Shape.SQUARE);
        shape.draw();
    }
}
