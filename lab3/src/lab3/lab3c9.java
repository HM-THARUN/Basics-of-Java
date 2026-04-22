package lab3;
import java.util.Scanner;
import java.util.Random;

public class lab3c9 {
	
	

	    // User-defined function
	    public static String generateRandomString(int length) {
	        if (length <= 0) {
	            return "";
	        }

	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder randomString = new StringBuilder();

	        Random rand = new Random();

	        for (int i = 0; i < length; i++) {
	            int index = rand.nextInt(characters.length());
	            randomString.append(characters.charAt(index));
	        }

	        return randomString.toString();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter desired length: ");
	        int length = sc.nextInt();

	        String result = generateRandomString(length);

	        System.out.println("Random String: " + result);

	        sc.close();
	    }
	
}
