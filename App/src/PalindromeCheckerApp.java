package PACKAGE_NAME;

public class PalindromeCheckerApp {
    static void main(String[] args) {
                // Hardcoded input
                String input = "madan";
                String reversed = "";

                // Iterate from last character to first
                for (int i = input.length() - 1; i >= 0; i--) {
                    reversed = reversed + input.charAt(i);
                }

                // Check if original and reversed strings are equal
                boolean isPalindrome = input.equals(reversed);

                System.out.println("Input text: " + input);
                System.out.println("Reversed text: " + reversed);
                System.out.println("Is it a Palindrome? : " + isPalindrome);
            }
        }
