package hbcu.stay.ready.baronsfarm.abstract_classes;

import hbcu.stay.ready.baronsfarm.interfaces.Eater;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.NoiseMaker;

public abstract class Person implements Eater, NoiseMaker {
    public abstract Edible eatEdible(Edible edible);
}
