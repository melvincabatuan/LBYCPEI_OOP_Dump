package module5.port;
import acm.program.*;

public class DebugJava extends ConsoleProgram {
	/* Reads a number from the user and reports whether or not it
	 * is prime.
	 */
	public void run() {
		/* Get the value from the user. */
		int value = readPositiveInt();
		
		/* Check whether or not it is prime. */
		if(value == 1 || value == 0){
			println(value + " is neither prime nor composite");
		}
		else if (isPrime(value)) {
			println(value + " is prime.");
		} else {
			println(value + " is composite.");
		}
	}
	
	/**
	 * Given a positive integer, returns whether that integer is
	 * prime.
	 * 
	 * @param value The value to test.
	 * @return Whether or not it is prime.
	 */
	public boolean isPrime(int value) {
		/* Try all possible divisors of the number.  If any of them
		 * cleanly divide the number, we return that the number is
		 * composite.
		 */

		if (value < 0) return false;

		for (int divisor = 2; divisor < value; divisor++) {

			if (value==2) return true;

			else if (value % divisor == 0) return false;
		}

		return true;

	}
	
	/**
	 * Reads a positive integer from the user and returns it.
	 * 
	 * @return A positive integer entered by the user.
	 */
	public int readPositiveInt() {
		/* Get an initial value. */
		int value = readInt("Enter a positive integer: ");
		
		/* If the value was nonpositive, reprompt the user. */
		while (value < 0) {
			println("Please enter a positive integer.");
			value = readInt("Enter a positive integer: ");
		}
		
		return value;
	}
}
