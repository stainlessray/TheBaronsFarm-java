package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CropDusterTest {

    @BeforeClass
    public static void init() {
        Farm farm = new Farm();
    }

    @Test
    public void testMakeSomeNoise() {
        CropDuster cropDuster = new CropDuster();
        String actual = cropDuster.makeSomeNoise();
        String expected = "BRRRRRRR BRBR BRRRRRR!!!!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMountRideable() {
        CropDuster cropDuster = new CropDuster();
        cropDuster.mountRideable(new Pilot("Baroness", "throw your brackets up!"));
        Boolean expected = true;
        Boolean actual = cropDuster.getIsMounted();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPilotFertilizeField() {
        int actual = new CropDuster().fertilizeField();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPilotFertilizeFieldWithCropDuster() {
        new Farm();
        CreateFarm farm = new CreateFarm();
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot("test pilot", "hope I can fly");
        //int fertile = new CropDuster().fertilizeField();
        int actual = pilot.cropDust(cropDuster).fertilizeField();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}
