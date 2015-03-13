package za.ac.cput.chapte51;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapte51.behaviouraldesignpatterns.visitor.Body;
import za.ac.cput.chapte51.behaviouraldesignpatterns.visitor.BodyPart;
import za.ac.cput.chapte51.behaviouraldesignpatterns.visitor.MovePart;

/**
 * Created by student on 2015/03/10.
 */
public class TestVisitor {
    private BodyPart body = null;

    @Before
    public void setUp() {
        body = new Body();
        body.move(new MovePart());
    }

    @Test
    public void test() {
        Assert.assertEquals(true, body.move(new MovePart()).equalsIgnoreCase("Moving arms Moving legs Moving body "));
    }
}
