

import models.Circle;
import models.Point;
import models.Rectangle;
import models.Shape;


public class Paint {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        printSquare(circle);

        Rectangle rectangle = new Rectangle(3, 4);
        printSquare(rectangle);

        Point point = new Point();
        printSquare(point);

    }

    private static void printSquare(Shape shape) {
        System.out.println("Calculating the square of " + shape.getName());
        System.out.println(shape.square());
    }
}
