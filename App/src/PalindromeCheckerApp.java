
import java.util.*;

public class PalindromeCheckerApp {

        public static void main(String[] args) {

                    String input = "racecar";

                    // Create object of service class
                    PalindromeService service = new PalindromeService();

                    // Call method
                    boolean result = service.checkPalindrome(input);

                    // Print result
                    System.out.println("Input : " + input);
                    System.out.println("Is Palindrome? : " + result);
                }
            }

// Service class containing palindrome logic
            class PalindromeService {

                public boolean checkPalindrome(String input) {

                    int start = 0;
                    int end = input.length() - 1;

                    // Compare characters moving inward
                    while (start < end) {

                        if (input.charAt(start) != input.charAt(end)) {
                            return false;
                        }

                        start++;
                        end--;
                    }

                    return true;
                }
            }