// -----------------------------------------------------
// Course: COMP249
// Assignment (2)
// Part: (1)
// Written by: (Name: Ibrahim Elyyan)
// -----------------------------------------------------

package package1;
/**
 * This is a custom exception for the number of packages exceeds the limit
 * @author ibrahim_elyyan
 *
 */
public class AmountException extends Exception{
	/**
	 * Custom message to show the user of the exception
	 */
	public AmountException() {
		super("Loading this package will exceed the maximum amount limit.");
	}
	public AmountException(String message) {
		super(message);
	}
}

