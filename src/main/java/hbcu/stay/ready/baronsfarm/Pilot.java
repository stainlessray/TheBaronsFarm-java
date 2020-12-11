package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstract_classes.Person;

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

    public void makeSomeNoise() {
        System.out.printf("I am the Pilot %s %s %n", name, noise);
    }

    public void dustCrop() {
        // todo create farm class before creating dustCrop
    }

    @Override
    public void eatEdible() {

    }
}
