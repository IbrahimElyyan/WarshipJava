// -----------------------------------------------------
// Course: COMP249
// Assignment (2)
// Part: (1)
// Written by: (Name: Ibrahim Elyyan)
// -----------------------------------------------------

package package1;
/**
 * Letter is a type of package
 * @author ibrahim_elyyan
 *
 */
public class Letter extends Package{
	/**
	 * Constructor that initializes variables of the class
	 */
	public Letter() {
		super();
		calculateShippingCost();
	}
	/**
	 * Parameterized constructor that initialize all the attributes of the created object from this class
	 * @param trackingNum is the tracking number
	 * @param weight is the weight
	 */
	public Letter(int trackingNum, double weight) {
		super(trackingNum,weight);
		calculateShippingCost();
	}

	@Override
	/**
	 * method to calculate shipping cost
	 */
	public void calculateShippingCost() {
		this.shippingCost = 0.05*weight;
	}

	@Override
	/**
	 * method to determine if package can be loaded into the truck
	 * @param n weight of the package
	 * @return
	 */
	public double load(double n) {
		try {
			if(n>32) {
				throw new PackageException();
			}
		} catch (PackageException e) {
			System.out.println(e.getMessage());
		}
		return n;
	}

	@Override
	/**
	 * this method shows information about the object of this class
	 */
	public String toString() {
		return "Letter [trackingNum=" + trackingNum + ", weight=" + weight + "ounces, shippingCost=$" + shippingCost + "]";
	}

	
	
}
