package hbcu.stay.ready.baronsfarm;

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

        for (String person : people) {
            String[] newPersons = person.split(",");
            type = newPersons[0];
            name = newPersons[1].trim();
            noise = newPersons[2];
            System.out.println("***" + name + "***");
            //if (name != null) {
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
                        froilan = new Farmer(name,noise);
                        System.out.println(froilan);
                        break;
            }
        }

        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {

            switch (day) {
                case MONDAY:
                    baron.eatEdible(new Tomato());
                    break;

                case TUESDAY:
                    baron.eatEdible(new Egg());
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
            System.out.println(day + "\n");
        }
    }
}
