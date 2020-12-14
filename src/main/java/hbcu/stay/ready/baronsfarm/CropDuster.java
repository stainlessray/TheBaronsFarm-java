package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstract_classes.Vehicle;
import hbcu.stay.ready.baronsfarm.interfaces.Aircraft;
import hbcu.stay.ready.baronsfarm.interfaces.Rider;

public class CropDuster extends Vehicle implements Aircraft {
    private Boolean isMounted = false;
    private Rider planeRider;

    @Override
    public String makeSomeNoise() {
        String noise = "BRRRRRRR BRBR BRRRRRR!!!!";
        System.out.println(noise);
        return noise;
    }

    @Override
    public Boolean mountRideable(Rider planeRider) {
        isMounted = true;
        this.planeRider = planeRider;
        System.out.printf(this.planeRider + " %n isMounted = " + isMounted.toString() + "%n");
        makeSomeNoise();
        return this.isMounted;
    }

    public String getIsMounted() {
        String mountStatus = this.isMounted.toString();
        return mountStatus;
    }
}
