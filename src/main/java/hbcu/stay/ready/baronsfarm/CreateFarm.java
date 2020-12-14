package hbcu.stay.ready.baronsfarm;

import java.util.*;

public class CreateFarm {

    private ArrayList<String> farmHouse = new ArrayList<>();
    private Map<String, Integer> stables = new HashMap<>();
    private Map<String, Integer> chickenCoups = new HashMap<>();
    private Map<String, Boolean> field = new HashMap<>();
    private Map<String, Integer> edibleProduce = new HashMap<>();

    String barron = "Farmer, Baron, Throw your brackets up";
    String baroness = "Pilot, Baroness, Start the engines!";
    String froilan = "Farmer, Froilan, I'm ready for veggies!";

    List<String> cropList = Arrays.asList(
            "Cornstalk",
            "Tomato Plant",
            "Sunflower",
            "Straw",
            "Flowers");


    public CreateFarm() {
        System.out.println("Initializing farm");
        createFarmhouse();
        createStables();
        createChickenCoups();
        createFieldOfCrops();
        createProduce();
        System.out.println("Initialization complete..");
    }


    private void createFieldOfCrops() {
        Integer MAX_CROPROWS = 5;
        Integer ROW_LENGTH = 5;

        System.out.printf("Tender plowing to create %d croprows " +
                "that are %d parsecs long %n", MAX_CROPROWS, ROW_LENGTH);

        for (String crop : cropList) {
            System.out.printf("Adding %s to croprow%n", crop);
            field.put(crop, false);
        }

        System.out.printf("Croprows complete%n%s%n", field.toString());
    }

    public String getFieldOfCrops() {

        String currentCropRow = "";
        StringBuilder allCropRows = new StringBuilder();
        for (String crop : cropList ) {
            currentCropRow = String.valueOf(field.get(crop));
            allCropRows.append(crop + " " + currentCropRow + "\n");
        }
        return String.format("Current crops and fertilized state\n" + allCropRows);
    }

    public int plantCrops() {
        System.out.println("Planting the field");
        // todo check against fertilized state
        int fieldSize = field.size();
        if (fieldSize == 0) {
            createFieldOfCrops();
        } else System.out.println("Field already has crops");
        return fieldSize;
    }

    private void createProduce() {
        edibleProduce.put("Egg", 0);
        for (String crop : cropList) {
            edibleProduce.put(crop, 0);
        }
    }

    public String getProduce() {
        StringBuilder allProduce = new StringBuilder();
        for ( String produce : cropList) {
            Integer currentProduce = edibleProduce.get(produce);
            allProduce.append(produce + " " + currentProduce + " \n");
        }
        return "Current Produce \n" + allProduce.toString();
    }

    public String harvestCrops() {
        System.out.println("Harvesting the crops ");
        String result = "";
        String produce = "";
        for (String crop : cropList) {
            int cropCount = 0;
            int yieldCount = 0;
            int produceCount = 0;
            Boolean currentFertilizerState = field.get(crop);
            //result = String.format(result + crop + " * " + currentFertilizerState.toString() + "%n");
            if (currentFertilizerState == true) {
                int currentProdCount = edibleProduce.get(crop);
                //System.out.println(currentProdCount);
                cropCount += 5;
                yieldCount += 5;
                produceCount = cropCount * yieldCount + currentProdCount;
                produce = String.format(crop + " * " + produceCount);
                edibleProduce.replace(crop, produceCount);
            }
        }
        field.clear();
        result = edibleProduce.entrySet().toString();
        return result;
    }

    public String fertilizeFieldOfCrops() {
        System.out.println("Fertilizing the fields...");

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

    // this gets object data from the farmHouse
    public String getFarmHouse() {
        String farmHands = farmHouse.toString();
        System.out.printf("Person objects stored in the farmhouse %s %n", farmHands);
        return farmHands;
    }

    // this gets the data for creating objects for the farmHouse
    public ArrayList getPeople() {
        ArrayList people = farmHouse;
        return people;
    }

    private void createFarmhouse() {
        System.out.println("Creating people...");
        farmHouse.add(barron);
        farmHouse.add(baroness);
        farmHouse.add(froilan);
        System.out.printf("People added to farmhouse %n %s %n", farmHouse.toString());
    }
}
