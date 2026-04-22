package lab3;
import java.util.Scanner;
public class lab3b5 {
	
	    // User-defined function
	    public static String removeWhitespace(String str) {
	        if (str == null) {
	            return null;
	        }

	        // Remove all whitespace (spaces, tabs, new lines)
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        String result = removeWhitespace(input);

	        System.out.println("String after removing whitespace: " + result);

	        sc.close();
	    }
	}

