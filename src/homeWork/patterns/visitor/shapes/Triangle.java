package homeWork.patterns.visitor.shapes;

public class Triangle extends Shape{
    private int side;
    private int h;

    public Triangle(int side, int h) {
        this.side = side;
        this.h = h;
    }

    public int getSide() {
        return side;
    }

    public int getH() {
        return h;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", h=" + h +
                '}';
    }
}
