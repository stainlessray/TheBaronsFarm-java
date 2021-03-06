package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstract_classes.Animal;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.Rideable;
import hbcu.stay.ready.baronsfarm.interfaces.Rider;

public class Horse extends Animal implements Rideable {
    private Boolean isMounted = false;
    private Rider horseRider;

    public Horse() {
        makeSomeNoise();
    }

    @Override
    public Edible eatEdible(Edible edible) {
        // todo
        return null;
    }

    @Override
    public String makeSomeNoise() {
        String noise = "Neigh!";
        System.out.println(noise);
        return noise;
    }

    @Override
    public Rider mountRideable(Rider horseRider) {
        isMounted = true;
        this.horseRider = horseRider;
        System.out.printf(this.horseRider + " %n isMounted = " + isMounted.toString());
        return horseRider;
    }

    public String getIsMounted() {
        String mountStatus = this.isMounted.toString();
        return mountStatus;
    }

    public Rider getHorseRider() {
        Rider currentRider = this.horseRider;
        return currentRider;
    }

}
