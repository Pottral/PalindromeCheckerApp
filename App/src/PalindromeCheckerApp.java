import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Create object of implementation class
        Palindrome checker = new StackPalindrome();

        boolean result = checker.isPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

// INTERFACE
interface Palindrome {
    boolean isPalindrome(String input);
}

// CLASS IMPLEMENTING INTERFACE
class StackPalindrome implements Palindrome {

    public boolean isPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}