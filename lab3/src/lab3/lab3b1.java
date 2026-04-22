package lab3;
import java.util.Scanner;
public class lab3b1 {

	public class CheckNullOrEmpty {

	    // User-defined function
	    public static boolean isNullOrEmpty(String str) {
	        return (str == null || str.trim().isEmpty());
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        if (isNullOrEmpty(input)) {
	            System.out.println("The string is NULL or contains only whitespace.");
	        } else {
	            System.out.println("The string is NOT null and contains valid characters.");
	        }

	        sc.close();
	    }
	}
}
