package za.ac.cput.chapte51;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapte51.structuraldesignpatterns.bridge.BigRactangle;
import za.ac.cput.chapte51.structuraldesignpatterns.bridge.Rectangle;
import za.ac.cput.chapte51.structuraldesignpatterns.bridge.Shape;
import za.ac.cput.chapte51.structuraldesignpatterns.bridge.SmallRectangle;

/**
 * Created by student on 2015/03/09.
 */
public class TestBridge {

    private Shape bigRectangle = null;
    private Shape smallRectangle = null;

    @Before
    public void setUp() {
        bigRectangle = new Rectangle(6, 5, new BigRactangle());
        smallRectangle = new Rectangle(3, 2, new SmallRectangle());
    }

    @Test
    public void testBigRectangle() {
        Assert.assertEquals(true, bigRectangle.draw().equalsIgnoreCase("Height: 6 Width: 5"));
    }

    @Test
    public void testSmallRectangle() {
        Assert.assertEquals(true, smallRectangle.draw().equalsIgnoreCase("Height: 3 Width: 2"));
    }
}
