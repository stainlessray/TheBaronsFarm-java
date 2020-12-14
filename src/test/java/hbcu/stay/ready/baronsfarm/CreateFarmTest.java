package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

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
        farm.fertilizeFieldOfCrops();
        String before = farm.getFieldOfCrops();
        farm.harvestCrops();
        String during = farm.getFieldOfCrops();
        farm.plantCrops();
        farm.fertilizeFieldOfCrops();
        String after = farm.getFieldOfCrops();
        System.out.println("***\n" +  before + " \n " + during + " \n " + after + "\n***");

    }

    @Test
    public void testHarvestCrops() {
        // todo after adding getter for produce
        // todo run this test against the produce array instead
        // harvesting will clear the field. so it will always be the same number if
        // using this rubric
        CreateFarm farm = new CreateFarm();
        farm.fertilizeFieldOfCrops();
        String first = farm.harvestCrops();
        farm.plantCrops();
        farm.fertilizeFieldOfCrops();
        String second = farm.harvestCrops();
        String field = farm.getFieldOfCrops();
        System.out.printf("***%n" + field);
        System.out.printf("First = %s%n Second = %s%n", first, second);
        // Because the field is cleared between harvests
        // the value should be the same each time = 0
        // Assert.assertEquals(first);
    }
}
