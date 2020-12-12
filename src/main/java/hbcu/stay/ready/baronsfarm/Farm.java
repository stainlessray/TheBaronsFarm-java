package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstract_classes.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Farm {

    private ArrayList<Person> farmHouse = new ArrayList<>();
    private Map<String, Integer> stables = new HashMap<>();
    private Map<String, Integer> chickenCoups = new HashMap<>();
    private Map<String, Integer> field = new HashMap<>();

    private final Integer HORSE_COUNT = 10;
    private final Integer MAX_STABLES = 3;
    private final Integer CHICKEN_COUPS = 4;
    private final Integer CROP_ROW = 5;

    public static void main(String[] args) {
        Farm farm = new Farm();
    }

    public Farm() {

        createPeople();
        createStables();
        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            DaysOfTheWeek today = day;
            System.out.println(today);
        }
    }

    private void createStables() {

        int count = 0;
        for (int i = 0; i < MAX_STABLES; i++) {

            for (int k = 0; k < HORSE_COUNT / 3 + 1; k++) {
                count += 1;
                stables.put("stable" + (i + 1), k + 1);
                if (count == HORSE_COUNT)
                    break;

            }
        }
        System.out.println(stables.toString());
    }

    public String getStables() {
        Integer currentStable = 0;
        StringBuilder allStables = new StringBuilder();

        for (int i = 0; i < stables.size(); i++) {
            currentStable = stables.get("stable" + (i + 1));
            allStables.append("stable").append(i + 1 + " ").append(currentStable + "\n");
        }
        System.out.println(allStables);
        return allStables.toString();
    }

    public String getFarmHouse() {
        String farmHands = farmHouse.toString(); //Arrays.toString(farmHouse.toArray());
        System.out.printf("Person objects stored in the farmhouse %s %n", farmHands);
        return farmHands;
    }

    private void createPeople() {

        String name = "Barron";
        String noise = "Throw your brackets up!";
        String name2 = "Baroness";
        String noise2 = "Start the engines!";
        String name3 = "Froilan";
        String noise3 = "I'm ready for veggies!";
        Farmer barron = new Farmer(name, noise);
        Farmer froilan = new Farmer(name3, noise3);
        Pilot baroness = new Pilot(name2, noise2);
        farmHouse.add(barron);
        farmHouse.add(baroness);
        farmHouse.add(froilan);
        //return getFarmHouse();
    }
}
