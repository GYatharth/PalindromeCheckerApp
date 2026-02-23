public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1: Welcome Message
        System.out.println("====================================");
        System.out.println(" Welcome to Palindrome Checker App ");
        System.out.println(" Version 1.0.0 ");
        System.out.println("====================================");

        System.out.println("Program will continue to next use case or exit.");
        System.out.println();

        // UC2: Hardcoded Palindrome Check (Using StringBuilder)
        String word = "madam";   // hardcoded string
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("UC2 Result: " + word + " is a palindrome.");
        } else {
            System.out.println("UC2 Result: " + word + " is NOT a palindrome.");
        }

        System.out.println();

        // UC3: Palindrome Check Using String Reverse (Using Loop)
        String input = "level";
        String reverse = "";

        // Reverse string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        // Compare original and reversed
        if (input.equals(reverse)) {
            System.out.println("UC3 Input String: " + input);
            System.out.println("UC3 Reversed String: " + reverse);
            System.out.println("UC3 Result: It is a Palindrome");
        } else {
            System.out.println("UC3 Input String: " + input);
            System.out.println("UC3 Reversed String: " + reverse);
            System.out.println("UC3 Result: It is NOT a Palindrome");
        }
    }
}