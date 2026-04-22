package lab3;
import java.util.Scanner;
public class lab3b4 {

	

	    // User-defined function
	    public static boolean isPalindrome(String str) {
	        if (str == null) {
	            return false;
	        }

	        // Remove punctuation and spaces, keep only letters and digits
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        int left = 0;
	        int right = cleaned.length() - 1;

	        while (left < right) {
	            if (cleaned.charAt(left) != cleaned.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is NOT a palindrome.");
	        }

	        sc.close();
	    }
	}

