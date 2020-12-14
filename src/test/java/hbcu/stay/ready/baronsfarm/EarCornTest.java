package hbcu.stay.ready.baronsfarm;

import org.junit.Test;

public class EarCornTest {

    @Test
    public void testEarCorn() {
        new Farm();
        new CreateFarm();
        // todo needs assertion
        String actual = new Farmer("farmer test", "I have no sound").eatEdible(new EarCorn());
    }
}
