package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class FarmTest {

        @Test
        public void testTuesday(){
        String actual = new Farm().doDailyWork(DaysOfTheWeek.TUESDAY);
        String expected = "TUESDAY";
        Assert.assertEquals(expected, actual);
        }

        @Test
        public void testConstructor(){
        Farm farm = new Farm();
        String actual = farm.toString();
        String expected = "Farm";
        Assert.assertTrue(actual.contains(expected));
        }
}
