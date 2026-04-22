package lab2;

public class lab2a {
	

	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        String str3 = new String("Hello");

	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("\nLength of str1: " + str1.length());
	        System.out.println("Character at index 1: " + str1.charAt(1));

	        // 3. String Comparison
	        System.out.println("\nstr1 equals str3: " + str1.equals(str3));
	        System.out.println("str1 == str3: " + (str1 == str3)); // compares references
	        System.out.println("str1 equalsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello"));

	        // 4. String Searching
	        String sentence = "Java is a powerful language";
	        System.out.println("\nIndex of 'powerful': " + sentence.indexOf("powerful"));
	        System.out.println("Contains 'Java'? " + sentence.contains("Java"));

	        // 5. Substring Operations
	        System.out.println("\nSubstring (0, 4): " + sentence.substring(0, 4));
	        System.out.println("Substring from index 5: " + sentence.substring(5));

	        // 6. String Modification
	        String modified = sentence.replace("powerful", "versatile");
	        System.out.println("\nAfter replace: " + modified);
	        System.out.println("Uppercase: " + sentence.toUpperCase());
	        System.out.println("Lowercase: " + sentence.toLowerCase());

	        // 7. Whitespace Handling
	        String spaced = "   Hello Java   ";
	        System.out.println("\nBefore trim: '" + spaced + "'");
	        System.out.println("After trim: '" + spaced.trim() + "'");

	        // 8. String Concatenation
	        String combined = str1 + " " + str2;
	        System.out.println("\nConcatenated string: " + combined);
	        System.out.println("Using concat(): " + str1.concat(" ").concat(str2));

	        // 9. String Splitting
	        String fruits = "Apple,Banana,Mango,Orange";
	        String[] fruitArray = fruits.split(",");
	        System.out.println("\nSplit fruits:");
	        for (String fruit : fruitArray) {
	            System.out.println(fruit);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");
	        sb.insert(4, " Language");
	        sb.replace(0, 4, "Advanced");
	        sb.delete(8, 16);

	        System.out.println("\nStringBuilder result: " + sb);

	        // 11. String Formatting
	        String name = "John";
	        int age = 25;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("\nFormatted String: " + formatted);

	        // 12. Validate Email using contains(), startsWith(), endsWith()
	        String email = "example@gmail.com";

	        boolean isValid = email.contains("@") &&
	                          email.contains(".") &&
	                          !email.startsWith("@") &&
	                          !email.endsWith("@") &&
	                          email.endsWith(".com");

	        System.out.println("\nEmail: " + email);
	        System.out.println("Is valid email? " + isValid);
	    }
	}

