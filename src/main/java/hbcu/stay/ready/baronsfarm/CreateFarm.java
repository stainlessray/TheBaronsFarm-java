package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.Rider;

import java.util.*;

public class CreateFarm {

    // todo abstract these with abstract collections
    private ArrayList<String> farmHouse = new ArrayList<>();
    private Map<String, Integer> stables = new HashMap<>();
    private Map<String, Integer> chickenCoups = new HashMap<>();
    private Map<String, Boolean> field = new HashMap<>();
    private Map<String, Integer> edibleProduce = new HashMap<>();

    String baron = "Farmer, Baron, Throw your brackets up";
    String baroness = "Pilot, Baroness, Start the engines!";
    String froilan = "Farmer, Froilan, I'm ready for veggies!";


    // todo make these enums
    List<String> cropList = Arrays.asList(
            "Cornstalk",
            "Tomato Plant",
            "Sunflower",
            "Straw",
            "Flowers");

    List<String> produceList = Arrays.asList(
            "Egg",
            "EarCorn",
            "Tomato",
            "Sunflowers",
            "Bails of Hay",
            "Flower Baskets");

    public CreateFarm() {
        System.out.println("Initializing farm");
        createFarmhouse();
        createStables();
        createChickenCoups();
        createFieldOfCrops();
        createProduce();
        System.out.println("----------------------------------------------------Initialization complete..");
    }

    public int everyMorning() {
        System.out.println();

        Farmer farmer = new Farmer("Baron", "It's time for breakfast");
        int cornCount = 1;
        int tomatoCount = 2;
        int eggCount = 5;

        Edible eggs = farmer.eatEdible(new Egg(eggCount));
        Edible corns = farmer.eatEdible(new EarCorn(cornCount));
        Edible tomatoes = farmer.eatEdible(new Tomato(tomatoCount));
        System.out.printf("ate %d Eggs %nate %d Corn %nate %d Tomatoes%n", eggCount, cornCount, tomatoCount);


        Pilot pilot = new Pilot("Baroness", "Let's eat");
        cornCount = 2;
        tomatoCount= 1;
        eggCount = 2;
        eggs = pilot.eatEdible(new Egg(eggCount));
        corns = pilot.eatEdible(new EarCorn(cornCount));
        tomatoes = pilot.eatEdible(new Tomato(tomatoCount));
        System.out.printf("ate %d Eggs %nate %d Corn %nate %d Tomatoes%n", eggCount, cornCount, tomatoCount);
        return 1;
    }

    public void dayMonday() {
        System.out.println("**Monday from the created farm**");
        Pilot pilot = new Pilot("Baroness", "Zoooom");
        CropDuster cropDuster = new CropDuster();
        fertilizeFieldOfCrops(cropDuster);
    }

    private void createFieldOfCrops() {
        Integer MAX_CROPROWS = 5;
        Integer ROW_LENGTH = 10;

        System.out.printf("Tender plowing to create %d croprows " +
                "that are %d parsecs long %n", MAX_CROPROWS, ROW_LENGTH);

        for (String crop : cropList) {
            System.out.printf("Adding %s to croprow%n", crop);
            field.put(crop, false);
        }

        System.out.printf("Croprows complete%n%s%n", field.toString());
    }

    public String getFieldOfCrops() {

        String currentCropRow;
        StringBuilder allCropRows = new StringBuilder();
        for (String crop : cropList ) {
            currentCropRow = String.valueOf(field.get(crop));
            allCropRows.append(crop);
            allCropRows.append(" ");
            allCropRows.append(currentCropRow);
            allCropRows.append("\n");
        }

        return "Current crops and fertilized state\n" + allCropRows;
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
        edibleProduce.put("Egg", 50);
        for (String produce : produceList) {
            edibleProduce.put(produce, 5);
        }
    }

    public String getProduce() {
        StringBuilder allProduce = new StringBuilder();
        for ( String produce : produceList) {
            Integer currentProduce = edibleProduce.get(produce);
            allProduce.append(produce);
            allProduce.append(" ");
            allProduce.append(currentProduce);
            allProduce.append(" \n");
        }

        return "Current Produce \n" + allProduce.toString();
    }

    public String harvestCrops() {
        System.out.println("Harvesting the crops ");
        String result;
        String produceName = "";
        //String produce = "";

        for (String crop : cropList) {
            int cropCount = 0;
            int yieldCount = 0;
            int produceCount;
            Boolean currentFertilizerState = field.get(crop);

            if (currentFertilizerState) {
                switch (crop) {
                    case "Cornstalk":
                        produceName = "EarCorn";
                        break;
                    case "Tomato Plant":
                        produceName = "Tomato";
                        break;
                    case "Sunflower":
                        produceName = "Sunflowers";
                        break;
                    case "Straw":
                        produceName = "Bails of Hay";
                        break;
                    case "Flowers":
                        produceName = "Flower Baskets";
                        break;
                }

                int currentProdCount = edibleProduce.get(produceName);
                cropCount += 5;
                yieldCount += 5;
                produceCount = cropCount * yieldCount + currentProdCount;
                if (produceName != "Egg")
                    edibleProduce.replace(produceName, produceCount);
            }
        }

        field.clear();
        result = edibleProduce.entrySet().toString();
        return result;
    }

    public String fertilizeFieldOfCrops() {

        String crops = getFieldOfCrops();
        if (crops != null) {
            System.out.println("Fertilizing the fields...");
            for (String crop : cropList) {
                field.replace(crop,true);
            }
            return getFieldOfCrops();

        } else return null;
    }

    public String fertilizeFieldOfCrops(CropDuster cropDuster) {

        String crops = getFieldOfCrops();
        if (crops != null) {
            System.out.println("Fertilizing the fields...");
            for (String crop : cropList) {
                field.replace(crop,true);
            }
            return getFieldOfCrops();

        } else return null;
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
        Integer currentCoup;
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
        Integer currentStable;
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
        farmHouse.add(baron);
        farmHouse.add(baroness);
        farmHouse.add(froilan);
        System.out.printf("People added to farmhouse %n %s %n", farmHouse.toString());
    }
}
