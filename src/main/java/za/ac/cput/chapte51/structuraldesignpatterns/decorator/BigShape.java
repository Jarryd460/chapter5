package za.ac.cput.chapte51.structuraldesignpatterns.decorator;

/**
 * Created by student on 2015/03/09.
 */
public class BigShape extends DrawShape {

    public BigShape(Shape shape) {
        super(shape);
    }

    @Override
    public String draw() {
        return shape.draw() + color(shape);
    }

    private String color(Shape shape) {
        return ": Red";
    }
}
