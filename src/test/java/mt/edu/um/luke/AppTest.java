package mt.edu.um.luke;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    Calculator c;


    @Before
    public void setup() {
        c = new Calculator();
    }


    @Test
    public void testThis() {
        Assert.assertEquals(4, c.add(2,2));
    }

    @Test
    public void testThis2() {
        Assert.assertEquals(3, c.minus(5,2));
    }

    @Test
    public void testTimes() {
        Assert.assertEquals(8, c.times(4,2));
    }

    @Test
    public void testSqrt() {
        Assert.assertEquals(3, c.sqrt(9), 0.0003);
    }
}

