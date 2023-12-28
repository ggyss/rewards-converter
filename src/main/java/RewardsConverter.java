import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Welcome to the Credit Card Rewards Converter!");
            System.out.print("Please enter a cash value to convert to airline miles: ");

            String input_value = scanner.nextLine();
            double cashValue = Double.parseDouble(input_value);

            System.out.println("Converting $" + cashValue + " to miles...");
            RewardValue rewardsValue = new RewardValue(cashValue);
            System.out.println("$" + cashValue + " is worth " + rewardsValue.getMilesValue() + " miles");
        } catch (NumberFormatException exception) {
            System.out.println("Error: Could not parse input value as a double. Please ensure you enter a numeric value.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
