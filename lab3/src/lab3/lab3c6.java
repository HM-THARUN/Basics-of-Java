package lab3;
import java.util.Scanner;
public class lab3c6 {
	
	    // User-defined function
	    public static String capitalizeWords(String str) {
	        if (str == null || str.isEmpty()) {
	            return str;
	        }

	        String[] words = str.split("\\s+");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            if (word.length() > 0) {
	                result.append(Character.toUpperCase(word.charAt(0)));
	                result.append(word.substring(1).toLowerCase());
	                result.append(" ");
	            }
	        }

	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        String output = capitalizeWords(input);

	        System.out.println("Capitalized string: " + output);

	        sc.close();
	    }
	}

