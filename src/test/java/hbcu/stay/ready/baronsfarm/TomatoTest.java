package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import org.junit.Test;

public class TomatoTest {

    @Test
    public void testEatTomato() {
        new Farm();
        CreateFarm farm = new CreateFarm();
        String actual = new Farmer("test", "I have no sound").eatEdible(new Tomato());
        System.out.println(actual);
    }
}
