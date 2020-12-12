package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstract_classes.Animal;
import hbcu.stay.ready.baronsfarm.interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    private final String noise = "Neigh!";
    private Boolean isMounted = false;

    public Horse() {
        makeSomeNoise();
    }

    @Override
    public void eatEdible() {
        // todo implement after edible is implemented
    }

    @Override
    public void makeSomeNoise() {
        System.out.println(noise);
    }

    @Override
    public void mountRideable() {

    }
}
