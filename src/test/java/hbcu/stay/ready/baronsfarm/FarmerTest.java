package hbcu.stay.ready.baronsfarm;


import hbcu.stay.ready.baronsfarm.abstract_classes.Person;
import hbcu.stay.ready.baronsfarm.interfaces.Botanist;
import hbcu.stay.ready.baronsfarm.interfaces.Eater;
import hbcu.stay.ready.baronsfarm.interfaces.NoiseMaker;
import hbcu.stay.ready.baronsfarm.interfaces.Rider;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void testConstructor() {
        String name = "Barron";
        String noise = "Throw your brackets up!";
        Farmer actual = new Farmer(name, noise);
        System.out.println(actual);
        Assert.assertTrue(actual instanceof Farmer);
    }

    @Test
    public void testConstructor2() {
        String name = "Barron";
        String noise = "Throw your brackets up!";
        Farmer actual = new Farmer(name, noise);
        System.out.println(actual);
        Assert.assertTrue(actual instanceof Rider);
    }

    @Test
    public void testConstructor3() {
        String name = "Barron";
        String noise = "Throw your brackets up!";
        Farmer actual = new Farmer(name, noise);
        Assert.assertTrue(actual instanceof Eater);
    }

    @Test
    public void testConstructor4() {
        String name = "Barron";
        String noise = "Throw your brackets up!";
        Farmer actual = new Farmer(name, noise);
        System.out.println(actual);
        Assert.assertTrue(actual instanceof Person);
    }

    @Test
    public void testConstructor5() {
        String name = "Barron";
        String noise = "Throw your brackets up!";
        Farmer actual = new Farmer(name, noise);
        System.out.println(actual);
        Assert.assertTrue(actual instanceof Botanist);
    }

    @Test
    public void testConstructor6() {
        String name = "Barron";
        String noise = "Throw your brackets up!";
        Farmer actual = new Farmer(name, noise);
        System.out.println(actual);
        Assert.assertTrue(actual instanceof NoiseMaker);
    }

    @Test
    public void testGetName() {
        String expected = "Barron";
        String noise = "Throw your brackets up!";
        Farmer name = new Farmer(expected, noise);
        String actual = name.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDustCrop() {
        // can't test until Farm is implemented
    }
}