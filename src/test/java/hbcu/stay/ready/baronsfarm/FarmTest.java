package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class FarmTest {

    @Test
    public void testFarmConstructor() {
        Farm farm = new Farm();
        Assert.assertTrue(farm instanceof Farm);
    }

    @Test
    public void testGetFarmhouse() {
        Farm farm = new Farm();
        //String expected = "Test";
        String actual = farm.getFarmHouse();
        System.out.println(actual);
        Assert.assertTrue(actual.contains("Farmer"));
    }

    @Test
    public void testGetStables() {
        Farm farm = new Farm();
        String actual = farm.getStables();
        Assert.assertTrue(actual.contains("stable3"));
    }
}
