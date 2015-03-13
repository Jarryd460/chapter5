package za.ac.cput.chapte51;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapte51.behaviouraldesignpatterns.strategy.DistinctionPass;
import za.ac.cput.chapte51.behaviouraldesignpatterns.strategy.NormalPass;
import za.ac.cput.chapte51.behaviouraldesignpatterns.strategy.Student;
import za.ac.cput.chapte51.behaviouraldesignpatterns.strategy.TestScore;

/**
 * Created by student on 2015/03/10.
 */
public class TestStrategy {

    private TestScore distinctionPass = null;
    private TestScore normalPass = null;
    private Student student1 = null;
    private Student student2 = null;

    @Before
    public void setUp() {
        distinctionPass = new DistinctionPass();
        normalPass = new NormalPass();
        student1 = new Student(83, distinctionPass);
        student2 = new Student(56, normalPass);
    }

    @Test
    public void getDistinctionScore() {
        Assert.assertEquals(83, student1.getScore());
    }

    @Test
    public void testDistinctionPass() {
        Assert.assertEquals(true, student1.result());
    }

    @Test
    public void getNormalScore() {
        Assert.assertEquals(56, student2.getScore());
    }

    @Test
    public void testNormalPass() {
        Assert.assertEquals(true, student2.result());
    }
}
