package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class FarmTest {

        @Test
        public void testTuesday(){
        String actual = new Farm().doDailyWork(DaysOfTheWeek.TUESDAY);
        String expected = "TUESDAY";
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
        }
}
