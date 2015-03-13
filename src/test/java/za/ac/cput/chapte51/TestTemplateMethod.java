package za.ac.cput.chapte51;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapte51.behaviouraldesignpatterns.templatemethod.Car;
import za.ac.cput.chapte51.behaviouraldesignpatterns.templatemethod.Train;
import za.ac.cput.chapte51.behaviouraldesignpatterns.templatemethod.Transport;

/**
 * Created by student on 2015/03/09.
 */
public class TestTemplateMethod {

    private Transport car = null;
    private Transport train = null;

    @Before
    public void setUp() {
        car = new Car();
        train = new Train();
    }

    @Test
    public void testCar() {
        Assert.assertEquals(true, car.start().equalsIgnoreCase("Start car"));
        Assert.assertEquals(true, car.energySource().equalsIgnoreCase("Petrol"));
        Assert.assertEquals(true, car.ride().equalsIgnoreCase("Energy source: Petrol, Start: Start car"));
    }

    @Test
    public void testTrain() {
        Assert.assertEquals(true, train.start().equalsIgnoreCase("Turbines on"));
        Assert.assertEquals(true, train.energySource().equalsIgnoreCase("Coal"));
        Assert.assertEquals(true, train.ride().equalsIgnoreCase("Energy source: Coal, Start: Turbines on"));
    }
}
