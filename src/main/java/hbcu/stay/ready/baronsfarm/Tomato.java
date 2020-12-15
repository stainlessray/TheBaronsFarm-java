package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class Tomato implements Edible {

    public Tomato() {
        System.out.println("1 Red juicy tomato going down");
    }

    public Tomato(Integer quantity) {
        for (int m = 0; m < quantity; m++) {
            Edible eaten = new Tomato();
        }
    }
}
