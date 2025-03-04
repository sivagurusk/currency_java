import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Create a map for storing exchange rates (currency -> INR exchange rate)
        HashMap<String, Double> exchangeRates = new HashMap<>();

        // Add exchange rates for various currencies to INR (static values for demo purposes)
        exchangeRates.put("USD", 82.50);  // Example: 1 USD = 82.50 INR
        exchangeRates.put("EUR", 88.00);  // Example: 1 EUR = 88.00 INR
        exchangeRates.put("GBP", 102.00); // Example: 1 GBP = 102.00 INR
        exchangeRates.put("JPY", 0.61);   // Example: 1 JPY = 0.61 INR
        exchangeRates.put("AUD", 54.00);  // Example: 1 AUD = 54.00 INR
        exchangeRates.put("CAD", 60.00);  // Example: 1 CAD = 60.00 INR
        exchangeRates.put("CNY", 11.80);  // Example: 1 CNY = 11.80 INR
        exchangeRates.put("INR", 1.00);   // 1 INR = 1 INR (just for reference)

        // Display available currencies
        System.out.println("Available Currencies:");
        for (String currency : exchangeRates.keySet()) {
            System.out.println(currency);
        }

        // Ask the user for the currency
        System.out.print("\nEnter the currency code (e.g., USD, EUR, GBP): ");
        String currency = scanner.nextLine().toUpperCase();

        // Check if the currency is valid
        if (!exchangeRates.containsKey(currency)) {
            System.out.println("Invalid currency code.");
            return;
        }

        // Ask the user for the amount to convert
        System.out.print("Enter the amount in " + currency + ": ");
        double amount = scanner.nextDouble();

        // Get the exchange rate for the chosen currency
        double exchangeRate = exchangeRates.get(currency);

        // Convert the amount to INR
        double convertedAmount = amount * exchangeRate;

        // Display the result
        System.out.printf("The amount in INR is: %.2f%n", convertedAmount);

        // Close the scanner object
        scanner.close();
    }
}
