package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;


public class FarmTest {

    @Test
    public void testFarmConstructor() {
        Class<?>[] test = Farm.class.getClasses();
        Assert.assertNotNull(test);
    }

    @Test
    public void testConfirmFarmhouseFarmerWasCreated() {
        String actual =  new Farm().getFarmHouse();
        Assert.assertTrue(actual.contains("Farmer"));
    }

    @Test
    public void testConfirmFarmhousePilotWasCreated() {
        String actual = new Farm().getFarmHouse();
        Assert.assertTrue(actual.contains("Pilot"));
    }

    @Test
    public void testGetStables() {
        String actual = new Farm().getStables();
        Assert.assertTrue(actual.contains("stable3"));
    }

    @Test
    public void testGetCoups() {
        String actual = new Farm().getCoups();
        Assert.assertTrue(actual.contains("coup4"));
    }

    @Test
    public void testCreateField() {
        Farm farm = new Farm();
    }
}
