package hbcu.stay.ready.baronsfarm;
class Farm {

    public static void main(String[] args) {
        Farm farm = new Farm();
    }

    public Farm() {
        InitializeFarm farm = new InitializeFarm();
        farm.fertilizeFieldOfCrops();
        System.out.println(farm.getFieldOfCrops());
        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            System.out.println(day);
        }
    }
}
