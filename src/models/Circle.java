

package models;

public class Circle extends Shape {
    int radius;

    public Circle(final int radius) {
        this.radius = radius;
        name = "circle";
    }

    @Override
    public int sqare() {
        return (int) Math.round(2 * Math.PI * radius * radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(final int radius) {
        this.radius = radius;
    }
}
