// Accept user input (either a string or a number).
import java.util.Scanner;
 
public class App {
    public static void main(String[] args) throws Exception {
        // Accept user input (either a string or a number).
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("Enter a word, sentence, or number and I will see if it is a palindrone: ");
        word = sc.nextLine();

        // Convert the input into a format suitable for checking (e.g., lowercase for strings, removing spaces for sentences).
        String new_word = word.replaceAll("\\s", "");
        new_word = new_word.toLowerCase();
        if (isPalindrome(new_word)) {
            System.out.println(new_word + " is a Palindrone!");
        }
        else{
            System.out.println(new_word + " is NOT a Palindrone!");
        }
        
        
    }

    public static boolean isPalindrome(String word) {
        while (word.length() > 1) { 
            // Get first and last characters
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            
            // If they don't match, it's not a palindrome
            if (first != last) {
                return false;
            }

            // Remove first and last characters
            word = word.substring(1, word.length() - 1);
        }
        
        return true; // If loop completes, it's a palindrome
    }
}


// Accept user input (either a string or a number).

// Convert the input into a format suitable for checking (e.g., lowercase for strings, removing spaces for sentences).

// Implement logic to check if the input is a palindrome.

// Display whether the input is a palindrome or not.

// Implement at least two different approaches:

// Using a loop to manually check characters.

// Using StringBuilder reverse() method.

