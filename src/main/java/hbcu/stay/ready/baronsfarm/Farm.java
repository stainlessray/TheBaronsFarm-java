package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.Rider;

import java.util.ArrayList;

class Farm {

    public static void main(String[] args) {
        new Farm();
    }

    public Farm() {
        String name = "";
        String type = "";
        String noise = "";
        Farmer baron = new Farmer(name, noise);
        Farmer froilan = new Farmer(name, noise);
        Pilot baroness = new Pilot(name, noise);

        CreateFarm farm = new CreateFarm();


        ArrayList<String> people = farm.getPeople();
        String stableOfSteeds = farm.getStables();
        for (String person : people) {
            String[] newPersons = person.split(",");
            type = newPersons[0];
            name = newPersons[1].trim();
            noise = newPersons[2];
            System.out.println("***" + name + "***");
            if (name != null) {
                switch (name) {
                    case "Baron":
                        baron = new Farmer(name, noise);
                        System.out.println(baron);
                        break;

                    case "Baroness":
                        baroness = new Pilot(name, noise);
                        System.out.println(baroness);
                        break;

                    case "Froilan":
                        froilan = new Farmer(name, noise);
                        System.out.println(froilan);
                        break;
                }
            }
        }

        System.out.println();
        System.out.println("Beginning the work week");
        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println(day + "\n");
            farm.everyMorning();
            switch (day) {

                case MONDAY:
                    farm.dayMonday();
                    System.out.println();
                    break;

                case TUESDAY:
                    break;

                case WEDNESDAY:
                    break;

                case THURSDAY:
                    break;

                case FRIDAY:
                    break;

                case SATURDAY:
                    break;

                case SUNDAY:
                    break;
            }
        }
    }

    public String doDailyWork(DaysOfTheWeek day) {
        CreateFarm farm = new CreateFarm();
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println(day + "\n");
        farm.everyMorning();
        switch (day) {

            case MONDAY:
                farm.dayMonday();
                System.out.println();
                break;

            case TUESDAY:
                break;

            case WEDNESDAY:
                break;

            case THURSDAY:
                break;

            case FRIDAY:
                break;

            case SATURDAY:
                break;

            case SUNDAY:
                break;
        }

        return day.name();
    }
}
