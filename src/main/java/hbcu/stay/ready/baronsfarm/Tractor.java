package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstract_classes.Vehicle;
import hbcu.stay.ready.baronsfarm.interfaces.FarmVehicle;
import hbcu.stay.ready.baronsfarm.interfaces.Rider;

public class Tractor extends Vehicle implements FarmVehicle {
    private Boolean isMounted = false;
    private Rider tractorRider;

    @Override
    public void harvestCropRow() {
        // todo

    }

    @Override
    public String makeSomeNoise() {
        String noise = "VROOOM CHUG CHUG CHUG";
        System.out.println(noise);
        return noise;
    }

    @Override
    public Boolean mountRideable( Rider tractorRider ) {
        isMounted = true;
        this.tractorRider = tractorRider;
        System.out.printf(this.tractorRider + " %n isMounted = " + isMounted.toString());
        return this.isMounted;
    }

    public String getIsMounted() {
        String mountStatus = this.isMounted.toString();
        return mountStatus;
    }
}
