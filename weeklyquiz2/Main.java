package weeklyquiz2;

public class Main {
    public static void main(String[] args) {
        Beauty toner = new Beauty("토너", 10000, 1);
        Grocery meat = new Grocery("한우", 99000, 3);
        LargeAppliance oven = new LargeAppliance("오븐", 300000, 10);

        toner.output();
        meat.output();
        oven.output();
    }
}
