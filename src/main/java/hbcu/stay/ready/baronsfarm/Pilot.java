package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstract_classes.Person;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class Pilot extends Person {
    private final String name;
    private final String noise;

    public Pilot(String name, String noise) {
        this.name = name;
        this.noise = noise;
        makeSomeNoise();
    }

    public String getName() {
        return this.name;
    }

    public String makeSomeNoise() {
        System.out.printf("I am the Pilot %s %s %n", name, noise);
        return noise;
    }

    public void dustCrop() {
        // todo create farm class before creating dustCrop
    }

    @Override
    public void eatEdible(Edible edible) {

    }
}
