package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Rider;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class HorseTest {

    @BeforeClass
    public static void init() {
        Farm farm = new Farm();
    }

    @Test
    public void testHorseConstructor() {
        String actual = new Horse().toString();
        Assert.assertTrue(actual.contains("Horse@"));
    }

    @Test
    public void testMakeSomeNoise() {
        Horse horse = new Horse();
        String actual = horse.makeSomeNoise();
        String expected = "Neigh!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMountRideable() {
        Horse horse = new Horse();
        horse.mountRideable(new Farmer("Baron", "throw your brackets up!"));
        String expected = "true";
        String actual = horse.getIsMounted();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetHorseRider() {
        Horse horse = new Horse();
        horse.mountRideable(new Farmer("Baron", "throw your brackets up!"));
        Rider actual = horse.getHorseRider();
        Assert.assertNotNull(actual);
    }
}
