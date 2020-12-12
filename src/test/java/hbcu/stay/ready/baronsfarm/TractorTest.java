package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TractorTest {

    @BeforeClass
    public static void init() {
        Farm farm = new Farm();
    }

    @Test
    public void testMakeSomeNoise() {
        Tractor tractor = new Tractor();
        String actual = tractor.makeSomeNoise();
        String expected = "VROOOM CHUG CHUG CHUG";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMountRideable() {
    Tractor tractor = new Tractor();
    tractor.mountRideable(new Farmer("Baron", "throw your brackets up!"));
    String expected = "true";
    String actual = tractor.getIsMounted();
    Assert.assertEquals(expected, actual);
    }
}
