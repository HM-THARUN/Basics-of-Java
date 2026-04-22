package lab3;
import java.util.Scanner;
public class lab3b3 {

	

	    // User-defined function
	    public static String reverseString(String str) {
	        if (str == null) {
	            return null;
	        }

	        String reversed = "";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i);
	        }

	        return reversed;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        String result = reverseString(input);

	        System.out.println("Reversed string: " + result);

	        sc.close();
	    }
	}

