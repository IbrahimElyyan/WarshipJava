// -----------------------------------------------------
// Course: COMP249
// Assignment (2)
// Part: (1)
// Written by: (Name: Ibrahim Elyyan)
// -----------------------------------------------------

package package1;
/**
 * This is a custom exception for when a package is over the weight limit
 * @author ibrahim_elyyan
 *
 */
public class PackageException extends Exception {
	/**
	 * Custom message to show the user of the exception
	 */
	public PackageException() {
		super("This package is over the weight limit and was not loaded into the truck.");
	}
	
}
