

package models;

public class Rectangle extends Shape {
    private int x;
    private int y;

    public Rectangle(final int x, final int y) {
        this.x = x;
        this.y = y;
        super.name = "rectangle";
    }

    @Override
    public int square() {
        return x * y;
    }
}
