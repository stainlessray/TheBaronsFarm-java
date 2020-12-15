package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class EarCorn implements Edible {

    public EarCorn() {
        System.out.println("1 EarCorn going down the hatch");
    }

    public EarCorn(Integer quantity) {
        for (int j = 0; j < quantity; j++) {
            Edible eaten = new EarCorn();
        }
    }
}
