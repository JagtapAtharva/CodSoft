import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD", 83.5); // US Dollar
        exchangeRates.put("EUR", 91.12); // Euro
        exchangeRates.put("GBP", 104.5); // British Pound
        exchangeRates.put("INR", 0.012); // Indian Rupee
        exchangeRates.put("YEN", 0.58); // Japnese Yen
        exchangeRates.put("CAD", 61.8); // Canadian Dollar
        exchangeRates.put("AUD", 57.2); // Australian Dollar
        // Add more currencies as needed
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount:");
        double amount = scanner.nextDouble();
        System.out.println("Enter the source currency (e.g. USD, EUR, GBP, INR, YEN, CAD):");
        String sourceCurrency = scanner.next();
        System.out.println("Enter the target currency (e.g. USD, EUR, GBP, INR, YEN, CAD):");
        String targetCurrency = scanner.next();

        double convertedAmount = convert(amount, sourceCurrency, targetCurrency);
        System.out.println("The equivalent amount in " + targetCurrency + " is: " + convertedAmount);
    }

    public static double convert(double amount, String sourceCurrency, String targetCurrency) {
        double targetRate = exchangeRates.get(targetCurrency);
        return amount * targetRate;
    }
}