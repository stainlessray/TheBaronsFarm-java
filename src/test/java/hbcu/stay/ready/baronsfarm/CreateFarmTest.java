package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class CreateFarmTest {

    @Test
    public void testFarmConstructor() {
        Class<?>[] test = Farm.class.getClasses();
        Assert.assertNotNull(test);
    }

    @Test
    public void testConfirmFarmhouseFarmerWasCreated() {
        String actual =  new CreateFarm().getFarmHouse();
        Assert.assertTrue(actual.contains("Farmer"));
    }

    @Test
    public void testConfirmFarmhousePilotWasCreated() {
        boolean actual = new CreateFarm().getFarmHouse().contains("Baroness");
        Assert.assertTrue(actual);
    }

    @Test
    public void testGetStables() {
        String actual = new CreateFarm().getStables();
        Assert.assertTrue(actual.contains("stable3"));
    }

    @Test
    public void testGetCoups() {
        String actual = new CreateFarm().getCoups();
        Assert.assertTrue(actual.contains("coup4"));
    }

    @Test
    public void testGetFieldOfCrops() {
        String crops = new CreateFarm().getFieldOfCrops();
        System.out.println(crops);
        Assert.assertTrue(crops.contains("Cornstalk"));
    }

    @Test
    public void testFertilizeFieldOfCrops() {
        CreateFarm farm = new CreateFarm();
        String actual = farm.fertilizeFieldOfCrops();
        System.out.println(actual);
        Assert.assertTrue(actual.contains("true"));

    }

    @Test
    public void testGetPeople() {
        String people = new CreateFarm().getPeople().toString();
        System.out.println(people);
        Assert.assertTrue(people.contains("Farmer"));
    }

    @Test
    public void testPlantCrops() {
        // todo
        CreateFarm farm = new CreateFarm();
        String actualCrops = farm.getFieldOfCrops();
        Assert.assertTrue(actualCrops != null);
    }

    @Test
    public void testHarvestCrops() {
        CreateFarm farm = new CreateFarm();
        int plantCrops1 = farm.plantCrops();
        String actual = farm.harvestCrops();
        int plantCrops2 = farm.plantCrops();
        Assert.assertTrue(plantCrops1 > plantCrops2);
    }

    @Test
    public void testGetProduce() {
        String actual = new CreateFarm().getProduce();
        System.out.println(actual);
        Assert.assertTrue(actual != null);
    }

    @Deprecated
    // This test is unneeded because of the
    // test testGetProduce. It tests that it is created
    // after initial population on farm start
    @Test
    public void testCreateProduce() {
    }
}
