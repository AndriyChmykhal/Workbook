

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
    public int sqare() {
        return x * y;
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }
}
