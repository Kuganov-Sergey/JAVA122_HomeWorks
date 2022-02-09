package homeWork.patterns.visitor.visitors;

import homeWork.patterns.visitor.shapes.Shape;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationVisitor implements Visitor {
    private final String FILENAME = "shapes.bin";
    private Shape shape;

    @Override
    public void save(Shape shape) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            os.writeObject(shape);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void load() {
        try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream(FILENAME))) {
            System.out.println(oi.readObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
