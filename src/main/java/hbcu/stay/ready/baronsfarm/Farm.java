package hbcu.stay.ready.baronsfarm;
class Farm {

    public static void main(String[] args) {
        Farm instance = new Farm();
    }

    public Farm() {
        InitializeFarm farm = new InitializeFarm();
        System.out.println(farm.fertilizeFieldOfCrops());
        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            System.out.println(day);
        }
    }
}
