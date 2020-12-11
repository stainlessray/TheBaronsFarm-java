package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class FarmTest {

    @Test
    public void testFarmConstructor() {
        Farm actual = new Farm();
        //System.out.println(actual);
        //System.out.println(expected);
        Assert.assertTrue(actual instanceof Farm);
    }

    @Test
    public void testGetFarmhouse() {

    }
}
