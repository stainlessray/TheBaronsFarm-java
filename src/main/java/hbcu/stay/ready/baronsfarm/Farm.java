package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstract_classes.Person;

import java.util.*;

class Farm {

    private final Integer MAX_CROPROWS = 5;
    private final Integer ROW_LENGTH =5;

    private ArrayList<Person> farmHouse = new ArrayList<>();
    private Map<String, Integer> stables = new HashMap<>();
    private Map<String, Integer> chickenCoups = new HashMap<>();
    private Map<String, Boolean> field = new HashMap<>();

    public static void main(String[] args) {
        Farm farm = new Farm();
    }

    public Farm() {
        System.out.println("Initializing farm");
        createPeople();
        createStables();
        createChickenCoups();
        createField();
        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            DaysOfTheWeek today = day;
            System.out.println(today);
        }
    }

    public void createField() {
        System.out.printf("Tender plowing to create %d croprows " +
                "that are %d parsecs long", MAX_CROPROWS, ROW_LENGTH);
        List<String> cropList = Arrays.asList("Cornstalk",
                "Tomato Plant",
                "Sunflower",
                "Straw",
                "Flowers");

        int count = 0;
        for (String crop : cropList) {
            System.out.println("Adding crops to croprows" + (crop));
            field.put("cropRow " + crop, false);
        }

        System.out.printf("Croprows complete%n%s%n", field.toString());
    }

    private void createChickenCoups() {
        System.out.println("Creating Chicken Coups");
        int count = 0;

        Integer MAX_COUPS = 4;
        Integer CHICKEN_COUNT = 15;

        for (int i = 0; i < MAX_COUPS; i++) {
            System.out.println("Adding chickens to coup" + (i + 1));

            for (int k = 0; k < CHICKEN_COUNT / MAX_COUPS + 1; k++) {
                count += 1;
                // System.out.println(count);
                chickenCoups.put("coup" + (i + 1), k + 1);
                if (count == CHICKEN_COUNT)
                    break;
            }
        }
        System.out.printf("Coups complete%n%s%n", chickenCoups.toString());
    }

    public String getCoups() {
        Integer currentCoup = 0;
        StringBuilder allCoups = new StringBuilder();

        for (int i = 0; i < chickenCoups.size(); i++) {
            currentCoup = chickenCoups.get("coup" + (i + 1));
            allCoups.append("coup").append(i + 1 + " ").append(currentCoup + "\n");
        }

        System.out.println(new String(allCoups));
        return new String(allCoups);
    }


    private void createStables() {
        System.out.println("Creating stables");
        int count = 0;

        Integer MAX_STABLES = 3;
        for (int i = 0; i < MAX_STABLES; i++) {
            System.out.println("Adding horses to stable" + (i + 1));

            Integer HORSE_COUNT = 10;
            for (int k = 0; k < HORSE_COUNT / MAX_STABLES + 1; k++) {
                if (count >= HORSE_COUNT)
                    break;
                count += 1;
                // System.out.println(count);
                stables.put("stable" + (i + 1), k + 1);
            }
        }
        System.out.printf("Stables complete%n%s%n", stables.toString());
    }

    public String getStables() {
        Integer currentStable = 0;
        StringBuilder allStables = new StringBuilder();

        for (int i = 0; i < stables.size(); i++) {
            currentStable = stables.get("stable" + (i + 1));
            allStables.append("stable").append(i + 1 + " ").append(currentStable + "\n");
        }

        System.out.println(new String(allStables));
        return new String(allStables);
    }

    public String getFarmHouse() {
        String farmHands = farmHouse.toString();
        System.out.printf("Person objects stored in the farmhouse %s %n", farmHands);
        return farmHands;
    }

    private void createPeople() {
        System.out.println("Creating people...");
        String name = "Baron";
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
    }
}
