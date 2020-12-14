package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {

    @Test
    public void testEatTomato() {
        new Farm();
        CreateFarm farm = new CreateFarm();
        String actual = new Farmer("test", "I have no sound").eatEdible(new Tomato());
        String expected = "ate";
        Assert.assertTrue(actual.contains(expected));
    }
}
