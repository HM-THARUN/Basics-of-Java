package lab2;

public class lab2b {
	

	    public static void main(String[] args) {

	        int iterations = 10000;

	        // Test StringBuffer
	        StringBuffer stringBuffer = new StringBuffer();
	        long startTimeBuffer = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append("AIET");
	        }

	        long endTimeBuffer = System.nanoTime();
	        long timeTakenBuffer = endTimeBuffer - startTimeBuffer;

	        System.out.println("StringBuffer Time: " + timeTakenBuffer + " ns");

	        // Test StringBuilder
	        StringBuilder stringBuilder = new StringBuilder();
	        long startTimeBuilder = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append("AIET");
	        }

	        long endTimeBuilder = System.nanoTime();
	        long timeTakenBuilder = endTimeBuilder - startTimeBuilder;

	        System.out.println("StringBuilder Time: " + timeTakenBuilder + " ns");

	        // Result comparison
	        if (timeTakenBuilder < timeTakenBuffer) {
	            System.out.println("\nStringBuilder is faster than StringBuffer.");
	        } else {
	            System.out.println("\nStringBuffer is faster than StringBuilder.");
	        }
	    }
	}

