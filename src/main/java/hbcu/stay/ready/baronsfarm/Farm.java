package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

class Farm {

    public static void main(String[] args) {
        new Farm();
    }
    public Farm() {
        CreateFarm farm = new CreateFarm();
        ArrayList<String> people = farm.getPeople();

        for (String person : people) {
            String[] newPersons = person.split(",");
            String type = newPersons[0];
            String name = newPersons[1].trim();
            String noise = newPersons[2];
            System.out.println("***" + name + "***");
            if (name.equals("Baron") || name.equals("Froilan")) {
                System.out.printf("Farmer %s mounts a tractor%n and yells %n...", name);
                new Tractor().mountRideable(new Farmer(name, noise));
                if (farm.getFieldOfCrops().contains("true")) {
                    farm.harvestCrops(); }

                }  else {
                    new CropDuster().mountRideable(new Pilot(name, noise));
                    farm.fertilizeFieldOfCrops();
            }
            System.out.println(farm.getProduce());
        }

        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            switch (day) {
                case MONDAY:
                    System.out.println(day);

                    break;
                case TUESDAY:
                    System.out.println(day);

                    break;
                case WEDNESDAY:
                    System.out.println(day);

                    break;
                case THURSDAY:
                    System.out.println(day);

                    break;
                case FRIDAY:
                    System.out.println(day);

                    break;
                case SATURDAY:
                    System.out.println(day);

                    break;
                case SUNDAY:
                    System.out.println(day);

                    break;
            }
        }
    }
}
