package myjava.poly;

public class FindAreas {

    public static void main(String... args) {

        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(10, 8);
        Triangle t = new Triangle(10, 8);
        
        Figure figure = r;
        System.out.println("Area is " + figure.area());

        figref = t;
        System.out.println("Area is " + figure.area());

        figref = f;
        System.out.println("Area is " + figure.area());
    }
}
