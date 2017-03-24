

package models;

public class Circle extends Shape {
    int radius;

    public Circle(final int radius) {
        this.radius = radius;
        name = "circle";
    }

    @Override
    public int square() {
        return (int) Math.round(2 * Math.PI * radius * radius);
    }
}
