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
    public void testConstructor() {
        String chicken = new Chicken().toString();
        String expected = "Chicken";
        Assert.assertTrue(chicken.contains(expected));

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
        String actual = egg.toString();
        String expected = "Egg";
        Assert.assertTrue(actual.contains(expected));
    }

    @Test
    public void testEatEdible() {
        Edible earCorn = new Chicken().eatEdible(new EarCorn());
        String actual = earCorn.toString();
        String expected = "EarCorn";
        Assert.assertTrue(actual.contains(expected));
    }
}
