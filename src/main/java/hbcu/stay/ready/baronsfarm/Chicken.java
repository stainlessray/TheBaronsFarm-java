package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstract_classes.Animal;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.YieldsEdible;

public class Chicken extends Animal implements YieldsEdible {
    private static final Integer edibleCount = 1;
    private static final String noise = "cluck...cluckcluck...cluck";

    @Override
    public Edible eatEdible(Edible edible) {
        return edible;
    }

    @Override
    public Edible yieldEdible() {
        return new Egg();

    }

    public Chicken() {
        makeSomeNoise();
    }

    @Override
    public String makeSomeNoise() {
        System.out.println(noise);
        return noise;
    }

    @Override
    public Integer getEdibleCount() {
        return edibleCount;
    }
}
