package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstract_classes.Vehicle;
import hbcu.stay.ready.baronsfarm.interfaces.Aircraft;
import hbcu.stay.ready.baronsfarm.interfaces.Rider;

    public class CropDuster extends Vehicle implements Aircraft {
    private Boolean isMounted = false;

    @Override
    public String makeSomeNoise() {
        String noise = "BRRRRRRR BRBR BRRRRRR!!!!";
        System.out.println(noise);
        return noise;
    }

    //@Override
    public Rider mountRideable(Rider planeRider) {
        isMounted = true;
        System.out.printf(planeRider + " %n isMounted = " + isMounted.toString() + "%n");
        makeSomeNoise();
        return planeRider;
    }

    public Boolean getIsMounted() {
        //Boolean mountStatus = isMounted;
        return isMounted;
    }

    public int fertilizeField() {
        return 1;
    }
}
