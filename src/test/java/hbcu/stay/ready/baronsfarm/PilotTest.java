package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    @Test
    public void testConstructor() {
        String name = "Baroness";
        String noise = "Start the engines!";
        Pilot actual = new Pilot(name, noise);
        System.out.println(actual);
        Assert.assertTrue(actual instanceof Pilot);
    }

    @Test
    public void testGetName() {
        String expected = "Baroness";
        String noise = "Start the engines!";
        Pilot name = new Pilot(expected, noise);
        String actual = name.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDustCrop() {
        CreateFarm farm = new CreateFarm();
        CropDuster cropDuster = new CropDuster();
        String actual = farm.fertilizeFieldOfCrops(cropDuster);
        Assert.assertTrue(actual.contains("true"));
    }
}