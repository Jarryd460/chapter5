package za.ac.cput.chapte51.structuraldesignpatterns.decorator;

/**
 * Created by student on 2015/03/09.
 */
public abstract class DrawShape implements Shape{

    protected Shape shape;

    public DrawShape(Shape shape) {
        this.shape = shape;
    }

    public String draw() {
        return shape.draw();
    }
}
