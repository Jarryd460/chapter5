package za.ac.cput.chapte51;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapte51.behaviouraldesignpatterns.mediator.Person;

/**
 * Created by student on 2015/03/10.
 */
public class TestMediator {
    private Person person1 = null;
    private Person person2 = null;

    @Before
    public void setUp() {
        person1 = new Person("Jarryd");
        person2 = new Person("Deane");
    }

    @Test
    public void testPerson1Hello() {
        Assert.assertEquals(true, person1.sayHello().equalsIgnoreCase("Hello Jarryd"));
    }

    @Test
    public void testPerson1Goodbye() {
        Assert.assertEquals(true, person1.sayGoodbye().equalsIgnoreCase("Goodbye Jarryd"));
    }

    @Test
    public void testPerson2Hello() {
        Assert.assertEquals(true, person2.sayHello().equalsIgnoreCase("Hello Deane"));
    }

    @Test
    public void testPerson2Goodbye() {
        Assert.assertEquals(true, person2.sayGoodbye().equalsIgnoreCase("Goodbye Deane"));
    }
}
