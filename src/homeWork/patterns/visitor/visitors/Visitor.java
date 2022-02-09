package homeWork.patterns.visitor.visitors;

import homeWork.patterns.visitor.shapes.Shape;

public interface Visitor {
    void save(Shape shape);
    void load();
}
