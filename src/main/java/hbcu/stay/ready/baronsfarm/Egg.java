package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class Egg implements Edible {

    public Egg() {
        System.out.println("1 Egg going down nom nom");
    }

    public Egg(Integer quantity) {
        System.out.printf("**%d** eggs going down the hatch%n", quantity);
    }
}
