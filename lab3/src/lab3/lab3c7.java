package lab3;
import java.util.Scanner;
public class lab3c7 {
	

	
	    // User-defined function
	    public static String truncate(String str, int maxLength) {
	        if (str == null) {
	            return null;
	        }

	        // If string length is less than or equal to maxLength, return as is
	        if (str.length() <= maxLength) {
	            return str;
	        }

	        // If maxLength is too small, just return dots
	        if (maxLength <= 3) {
	            return "...".substring(0, maxLength);
	        }

	        // Truncate and add ellipsis
	        return str.substring(0, maxLength - 3) + "...";
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        System.out.print("Enter maximum length: ");
	        int length = sc.nextInt();

	        String result = truncate(input, length);

	        System.out.println("Truncated string: " + result);

	        sc.close();
	    }
	}

