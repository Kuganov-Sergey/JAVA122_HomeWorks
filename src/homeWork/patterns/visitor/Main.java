package homeWork.patterns.visitor;

import homeWork.patterns.visitor.shapes.Triangle;
import homeWork.patterns.visitor.visitors.SerializationVisitor;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(12, 3);
        SerializationVisitor serializationVisitor = new SerializationVisitor();
        serializationVisitor.save(triangle);
        serializationVisitor.load();
    }
}
