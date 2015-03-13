package za.ac.cput.chapte51;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapte51.structuraldesignpatterns.facade.DrawShape;

/**
 * Created by student on 2015/03/09.
 */
public class TestFacade {

    private DrawShape drawShape = null;

    @Before
    public void setUp() {
        drawShape = new DrawShape();
    }

    @Test
    public void drawRectangle() {
        Assert.assertEquals(true, drawShape.drawRectangle().equalsIgnoreCase("Draw Rectangle"));
    }

    @Test
    public void drawSquare() {
        Assert.assertEquals(true, drawShape.drawSquare().equalsIgnoreCase("Draw Square"));
    }
}
