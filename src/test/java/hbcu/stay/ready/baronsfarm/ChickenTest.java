package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ChickenTest {

    @BeforeClass
    public static void init() {
        Farm farm = new Farm();
    }

    @Test
    public void testMakeSomeNoise() {
        String expected = "cluck";
        String actual = new Chicken().makeSomeNoise();
        Assert.assertTrue( actual.contains(expected) );
    }

    @Test
    public void testGetEdibleCount() {
        Integer actual = new Chicken().getEdibleCount();
        Assert.assertFalse(actual < 1);
    }
}
