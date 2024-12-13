public class MoneyCalc {
    private static final int[] BILL_VALUES = {1000, 500, 100};
    private static final int[] COIN_VALUES = {25, 10, 5, 1}; 
    private static final String[] BILL_NAMES = {"ten dollar bills", "five dollar bills", "one dollar bills"};
    private static final String[] COIN_NAMES = {"quarters", "dimes", "nickels", "pennies"};

    public void calculateChange(double amount) {
        int totalCents = (int) Math.round(amount * 100);

        System.out.println();

        for (int i = 0; i < BILL_VALUES.length; i++) {
            int count = totalCents / BILL_VALUES[i];
            totalCents %= BILL_VALUES[i];
            System.out.println(count + " " + BILL_NAMES[i]);
        }

        for (int i = 0; i < COIN_VALUES.length; i++) {
            int count = totalCents / COIN_VALUES[i];
            totalCents %= COIN_VALUES[i];
            System.out.println(count + " " + COIN_NAMES[i]);
        }
    }
}
