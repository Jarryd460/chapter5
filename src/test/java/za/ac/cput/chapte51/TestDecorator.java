package za.ac.cput.chapte51;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapte51.structuraldesignpatterns.decorator.BigShape;
import za.ac.cput.chapte51.structuraldesignpatterns.decorator.Rectangle;
import za.ac.cput.chapte51.structuraldesignpatterns.decorator.Shape;
import za.ac.cput.chapte51.structuraldesignpatterns.decorator.Square;

/**
 * Created by student on 2015/03/09.
 */
public class TestDecorator {

    private Shape rectangle = null;
    private Shape bigRectangle = null;
    private Shape square = null;
    private Shape bigSquare = null;

    @Before
    public void setUp() {
        rectangle = new Rectangle();
        bigRectangle = new BigShape(new Rectangle());
        square = new Square();
        bigSquare = new BigShape(new Square());
    }

    @Test
    public void testRectangle() {
        Assert.assertEquals(true, rectangle.draw().equalsIgnoreCase("Rectangle"));
    }

    @Test
    public void testBigRectangle() {
        Assert.assertEquals(true, bigRectangle.draw().equalsIgnoreCase("Rectangle: Red"));
    }

    @Test
    public void testSquare() {
        Assert.assertEquals(true, square.draw().equalsIgnoreCase("Square"));
    }

    @Test
    public void testBigSquare() {
        Assert.assertEquals(true, bigSquare.draw().equalsIgnoreCase("Square: Red"));
    }
}
