
import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "civic";

        // Create a Queue to store characters (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into both queue and stack
        for(char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare characters until queue becomes empty
        while(!queue.isEmpty()) {
            if(queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}