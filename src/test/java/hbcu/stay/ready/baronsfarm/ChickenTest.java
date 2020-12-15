package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;
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
        Assert.assertTrue(actual.contains(expected));
    }

    @Test
    public void testGetEdibleCount() {
        Integer actual = new Chicken().getEdibleCount();
        Assert.assertFalse(actual < 1);
    }

    @Test
    public void testYieldEdible() {
        Edible egg = new Chicken().yieldEdible();
        System.out.println(egg.toString());
        String actual = egg.toString();
        Assert.assertTrue(actual.contains("Egg"));
    }
}
