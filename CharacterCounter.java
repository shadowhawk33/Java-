package practice.com;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //User input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        //Length of the string
        int length = input.length();
        
        //Output
        System.out.println("Number of characters in the string: " + length);
        
        // Close the scanner
        scanner.close();
    }
}
