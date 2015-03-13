package za.ac.cput.chapte51.structuraldesignpatterns.facade;

/**
 * Created by student on 2015/03/09.
 */
public class DrawShape {

    private Shape rectangle;
    private Shape square;

    public DrawShape() {
        rectangle = new Rectangle();
        square = new Square();
    }

    public String drawRectangle() {
        return rectangle.draw();
    }

    public String drawSquare() {
        return square.draw();
    }
}
