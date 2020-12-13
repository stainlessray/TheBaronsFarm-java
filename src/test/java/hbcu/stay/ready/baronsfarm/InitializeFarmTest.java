package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class InitializeFarmTest {

    @Test
    public void testFarmConstructor() {
        Class<?>[] test = Farm.class.getClasses();
        Assert.assertNotNull(test);
    }

    @Test
    public void testConfirmFarmhouseFarmerWasCreated() {
        String actual =  new InitializeFarm().getFarmHouse();
        Assert.assertTrue(actual.contains("Farmer"));
    }

    @Test
    public void testConfirmFarmhousePilotWasCreated() {
        String actual = new InitializeFarm().getFarmHouse();
        Assert.assertTrue(actual.contains("Pilot"));
    }

    @Test
    public void testGetStables() {
        String actual = new InitializeFarm().getStables();
        Assert.assertTrue(actual.contains("stable3"));
    }

    @Test
    public void testGetCoups() {
        String actual = new InitializeFarm().getCoups();
        Assert.assertTrue(actual.contains("coup4"));
    }

    @Test
    public void testGetFieldOfCrops() {
        String crops = new InitializeFarm().getFieldOfCrops();
        System.out.println(crops);
        Assert.assertTrue(crops.contains("Cornstalk"));
    }

    @Test
    public void testFertilizeFieldOfCrops() {
        InitializeFarm farm = new InitializeFarm();
        String actual = farm.fertilizeFieldOfCrops();
        System.out.println(actual);
    }
}
