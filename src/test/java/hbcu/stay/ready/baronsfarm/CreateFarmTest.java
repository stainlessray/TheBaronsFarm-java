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
        CreateFarm farm = new CreateFarm();
        String actualCrops = farm.getFieldOfCrops();
        Assert.assertNotNull(actualCrops);
    }

    @Test
    public void testHarvestCrops() {
        CreateFarm farm = new CreateFarm();
        int plantCrops1 = farm.plantCrops();
        farm.harvestCrops();
        int plantCrops2 = farm.plantCrops();
        Assert.assertTrue(plantCrops1 > plantCrops2);
    }

    @Test
    public void testGetProduce() {
        String actual = new CreateFarm().getProduce();
        System.out.println(actual);
        Assert.assertTrue(actual != null);
    }

    @Test
    public void testHarvestCycle() {
        CreateFarm farm = new CreateFarm();
        for (int i = 0; i < 10; i++) {
            farm.fertilizeFieldOfCrops();
            farm.harvestCrops();
            farm.plantCrops();
            System.out.println(farm.getProduce());


        }

      /*  System.out.println(farm.getFieldOfCrops());
        farm.fertilizeFieldOfCrops();
        farm.harvestCrops();
        farm.plantCrops();
        System.out.println(farm.getProduce());
        farm.fertilizeFieldOfCrops();
        farm.harvestCrops();
        farm.plantCrops();farm.fertilizeFieldOfCrops();
        farm.harvestCrops();
        farm.plantCrops();*/

    }
}
