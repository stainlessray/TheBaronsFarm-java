package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

class Farm {

    public static void main(String[] args) {
        Farm instance = new Farm();
    }
    public Farm() {
        CreateFarm farm = new CreateFarm();

        ArrayList<String> people = farm.getPeople();
        for (String person : people) {
            String[] newPersons = person.split(",");
            String type = newPersons[0];
            String name = newPersons[1];
            String noise = newPersons[2];
            if (name.equals("Baron") || name.equals("Froilan")) {
                //Farmer farmer = new Farmer(name, noise);
                System.out.printf("Farmer %s mounts a tractor", name);
                new Tractor().mountRideable(new Farmer(name, noise)); }
            else {
                new CropDuster().mountRideable(new Pilot(name, noise));
                farm.fertilizeFieldOfCrops();
            }
        }

        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            System.out.println(day);
        }
    }
}
