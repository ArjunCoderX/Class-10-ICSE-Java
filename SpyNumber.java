import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum and product variables
        int sum = 0;
        int product = 1;
        int temp = number;

        // Loop through each digit of the number
        while (temp > 0) {
            int digit = temp % 10; // Get the last digit
            sum += digit; // Add the digit to sum
            product *= digit; // Multiply the digit to product
            temp /= 10; // Remove the last digit
        }

        // Check if the sum and product are equal
        if (sum == product) {
            System.out.println(number + " is a Spy Number.");
        } else {
            System.out.println(number + " is not a Spy Number.");
        }

        // Close the scanner
        scanner.close();
    }
}
