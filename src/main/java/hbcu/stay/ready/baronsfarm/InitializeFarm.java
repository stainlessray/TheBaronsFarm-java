package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstract_classes.Person;
import java.util.*;

public class InitializeFarm {

    private ArrayList<Person> farmHouse = new ArrayList<>();
    private Map<String, Integer> stables = new HashMap<>();
    private Map<String, Integer> chickenCoups = new HashMap<>();
    private Map<String, Boolean> field = new HashMap<>();

    public InitializeFarm() {
        System.out.println("Initializing farm");
        createFarmhouse();
        createStables();
        createChickenCoups();
        createFieldOfCrops();
    }
    private void createFieldOfCrops() {
        Integer MAX_CROPROWS = 5;
        Integer ROW_LENGTH = 5;

        // this should be an enum in the next sprint
        List<String> cropList = Arrays.asList("Cornstalk",
                "Tomato Plant",
                "Sunflower",
                "Straw",
                "Flowers");

        System.out.printf("Tender plowing to create %d croprows " +
                "that are %d parsecs long %n", MAX_CROPROWS, ROW_LENGTH);

        int count = 0;
        for (String crop : cropList) {
            System.out.printf("Adding %s to croprow%n", crop);
            field.put(crop, false);
        }

        System.out.printf("Croprows complete%n%s%n", field.toString());
    }

    public String getFieldOfCrops() {
        List<String> cropList = Arrays.asList("Cornstalk",
                "Tomato Plant",
                "Sunflower",
                "Straw",
                "Flowers");

        String currentCropRow = "";
        StringBuilder allCropRows = new StringBuilder();
        for (String crop : cropList ) {
            currentCropRow = String.valueOf(field.get(crop));
            allCropRows.append(crop + " " + currentCropRow + "\n");
        }
        return new String(allCropRows);
    }

    public String fertilizeFieldOfCrops() {
        System.out.println("Fertilizing the fields...");
        List<String> cropList = Arrays.asList("Cornstalk",
                "Tomato Plant",
                "Sunflower",
                "Straw",
                "Flowers");

        for (String crop : cropList) {
            field.replace(crop,true);
        }
        return getFieldOfCrops().toString();
    }

    private void createChickenCoups() {
        System.out.println("Creating Chicken Coups");
        int count = 0;

        int MAX_COUPS = 4;
        int CHICKEN_COUNT = 15;

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
        int MAX_STABLES = 3;
        for (int i = 0; i < MAX_STABLES; i++) {
            System.out.println("Adding horses to stable" + (i + 1));

            int HORSE_COUNT = 10;
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
            allStables.append("stable");
            allStables.append(i + 1 + " ");
            allStables.append(currentStable + "\n");
        }

        System.out.println(new String(allStables));
        return new String(allStables);
    }

    public String getFarmHouse() {
        String farmHands = farmHouse.toString();
        System.out.printf("Person objects stored in the farmhouse %s %n", farmHands);
        return farmHands;
    }

    private void createFarmhouse() {
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
