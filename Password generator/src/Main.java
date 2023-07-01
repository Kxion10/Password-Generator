import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Greeting
        System.out.println("Hello, this is your password generator.");

        // Prompt for password length
        System.out.println("Enter the number of characters you need for a password: ");

        // Create a scanner to read input
        Scanner input = new Scanner(System.in);

        // Read the password length from user input
        int digit = input.nextInt();

        // Enter the alphabet as a pool of letters and symbols to pull from when making a password
        String lower_cases = "qwertyuiopasdfghjklzxcvbnm";
        String upper_cases = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String numbers = "0123456789";
        String symbols = "^$*.[]{}()?-\"!@#%&/\\,><':;|_~`";

        // Set a password variable
        StringBuilder password = new StringBuilder();

        // Set up a method that randomly selects characters to populate the password
        while (password.length() < digit) {
            int rand = (int) (4 * Math.random());

            // Add a lowercase letter to the password
            if (rand == 0 && password.length() < digit) {
                int index = (int) (lower_cases.length() * Math.random());
                password.append(lower_cases.charAt(index));
            }

            // Add an uppercase letter to the password
            if (rand == 1 && password.length() < digit) {
                int index = (int) (upper_cases.length() * Math.random());
                password.append(upper_cases.charAt(index));
            }

            // Add a number to the password
            if (rand == 2 && password.length() < digit) {
                int index = (int) (numbers.length() * Math.random());
                password.append(numbers.charAt(index));
            }

            // Add a symbol to the password
            if (rand == 3 && password.length() < digit) {
                int index = (int) (symbols.length() * Math.random());
                password.append(symbols.charAt(index));
            }
        }

        System.out.println("Generated password: " + password.toString());
    }
}