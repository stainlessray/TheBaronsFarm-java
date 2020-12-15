package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class EarCornTest {

    @Test
    public void testEarCorn() {
        new Farm();
        new CreateFarm();
        String actual = String.valueOf(new Farmer("farmer test", "I have no sound").eatEdible(new EarCorn()));
        String expected = "EarCorn";
        Assert.assertTrue(actual.contains(expected));
    }
}
