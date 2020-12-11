package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstract_classes.Person;
import hbcu.stay.ready.baronsfarm.interfaces.Botanist;
import hbcu.stay.ready.baronsfarm.interfaces.Rider;

public class Farmer extends Person implements Botanist, Rider {
    private final String name;
    private final String noise;

    public Farmer(String name, String noise) {
        this.name = name;
        this.noise = noise;
        makeSomeNoise();
    }

    public String getName() {
        return this.name;
    }

    public void makeSomeNoise() {
        System.out.printf("I am the Farmer %s %s %n", name, noise);
    }

    public void plantCrop() {
        // todo create farm class before creating crop
    }

    @Override
    public void eatEdible() {
        // todo add code for eat edible after farm established
    }

    @Override
    public void plantCropRow(String cropRow, String crop) {
        // todo implement code for plantCropRow after Fam established
    }
}
