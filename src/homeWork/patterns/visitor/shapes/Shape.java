package homeWork.patterns.visitor.shapes;

import java.io.Serializable;

public abstract class Shape implements Serializable {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
