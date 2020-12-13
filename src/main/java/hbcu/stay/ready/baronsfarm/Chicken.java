package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstract_classes.Animal;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.YieldsEdible;

public class Chicken extends Animal implements YieldsEdible {
    private static final Integer edibleCount = 1;

    @Override
    public void eatEdible(Edible edible) {
        // todo
    }

    @Override
    public void yieldEdible() {
        // todo
    }


    public Chicken() {
        makeSomeNoise();
    }

    @Override
    public String makeSomeNoise() {
        String noise = "cluck...cluckcluck...cluck";
        System.out.println(noise);
        return noise;
    }

    @Override
    public Integer getEdibleCount() {
        return this.edibleCount;
    }
}
