package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstract_classes.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Farm {

    String name = "Barron";
    String noise = "Throw your brackets up!";
    String name2 = "Baroness";
    String noise2 = "Start the engines!";

    Farmer farmer = new Farmer(name, noise);
    Pilot pilot = new Pilot(name2, noise2);

    // todo consider and/or implement abstract storage objects

    private ArrayList<Person> farmHouse = new ArrayList<>();
    private Map<String, Integer> stables = new HashMap<>();
    private Map<String, Integer> chickenCoups = new HashMap<>();
    private Map<String, Integer> field = new HashMap<>();

    private final Integer MAX_STABLES = 3;
    private final Integer CHICKEN_COUPS = 4;
    private final Integer CROP_ROW = 5;

    public Farm() {

       farmHouse.add(farmer);
       farmHouse.add(pilot);
       getFarmHouse();
        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            DaysOfTheWeek today = day;
            System.out.println(today);

        }
    }

    public String getFarmHouse() {

        String farmHands = Arrays.toString(farmHouse.stream().toArray());
        System.out.printf("Person objects stored in the farmhouse %s %n", farmHands);
        return farmHands;

        // Loop option
        /*for (Person farmhand : farmHouse) {
             //farmhand.toString();
            System.out.println(farmHands);
            //System.out.println();
        }*/

    }

    public static void main(String[] args) {
        Farm farm = new Farm();

    }
}
