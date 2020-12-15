package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class EggTest {

    @Test
    public void testEatEgg() {
        new Farm();
        CreateFarm farm = new CreateFarm();
        String actual = String.valueOf(new Farmer("test", "I have no sound").eatEdible(new Egg()));
        String expected = "Egg";
        Assert.assertTrue(actual.contains(expected));
    }
}

