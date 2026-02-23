public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1: Welcome Message
        System.out.println("====================================");
        System.out.println(" Welcome to Palindrome Checker App ");
        System.out.println(" Version 1.0.0 ");
        System.out.println("====================================");
        System.out.println();

        // UC2: Hardcoded Palindrome Check (StringBuilder)
        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("UC2 Result: " + word + " is a palindrome.");
        } else {
            System.out.println("UC2 Result: " + word + " is NOT a palindrome.");
        }
        System.out.println();

        // UC3: Palindrome Check Using String Reverse (Loop)
        String input = "level";
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        if (input.equals(reverse)) {
            System.out.println("UC3 Result: " + input + " is a palindrome.");
        } else {
            System.out.println("UC3 Result: " + input + " is NOT a palindrome.");
        }
        System.out.println();

        // UC4: Character Array Based Palindrome Check (Two-Pointer)
        String text = "radar";
        char[] chars = text.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("UC4 Result: " + text + " is a palindrome.");
        } else {
            System.out.println("UC4 Result: " + text + " is NOT a palindrome.");
        }
    }
}