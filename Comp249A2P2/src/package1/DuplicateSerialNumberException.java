// -----------------------------------------------------
// Course: COMP249
// Assignment (2)
// Part: (2)
// Written by: (Name: Ibrahim Elyyan)
// -----------------------------------------------------

package package1;
/**
 * custom exception for when there is a duplicate serial number
 * @author ibrahim_elyyan
 *
 */
public class DuplicateSerialNumberException extends Exception {
	/**
	 * Custom message to show the user of the exception
	 */
	public DuplicateSerialNumberException(){
		super("Error.... Duplicate entry of serial number. The entered serial number already exists for another record.");
	}
	public DuplicateSerialNumberException(String message) {
		super(message);
	}
}
