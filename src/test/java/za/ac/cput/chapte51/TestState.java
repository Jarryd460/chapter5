package za.ac.cput.chapte51;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapte51.behaviouraldesignpatterns.state.Danger;
import za.ac.cput.chapte51.behaviouraldesignpatterns.state.Person;
import za.ac.cput.chapte51.behaviouraldesignpatterns.state.Safe;

/**
 * Created by student on 2015/03/10.
 */
public class TestState {

    private Person person1 = null;
    private Person person2 = null;

    @Before
    public void setUp() {
        person1 = new Person(new Danger());
        person2 = new Person(new Safe());
    }

    @Test
    public void testPerson1() {
        Assert.assertEquals(true, person1.move().equalsIgnoreCase("RUN!"));
    }

    @Test
    public void testPerson2() {
        Assert.assertEquals(true, person2.move().equalsIgnoreCase("Walk"));
    }
}
