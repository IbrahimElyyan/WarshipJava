// -----------------------------------------------------
// Course: COMP249
// Assignment (2)
// Part: (1)
// Written by: (Name: Ibrahim Elyyan)
// Student ID: (40167982)
// Due date: August 6, 2021 11:59pm
// -----------------------------------------------------

package package1;
/**
 * MetalCrate is a type of package
 * @author ibrahim_elyyan
 *
 */
public class MetalCrate extends Package {
	/**
	 * Constructor that initializes variables of the class
	 */
	public MetalCrate() {
		super();
	}
	/**
	 * Parameterized constructor that initialize all the attributes of the created object from this class
	 * @param trackingNum is the tracking number
	 * @param weight is the weight
	 */
	public MetalCrate(int trackingNum, double weight) {
		super(trackingNum,weight);
		calculateShippingCost();
	}

	@Override
	public void calculateShippingCost() {
		shippingCost = 3*weight;
	}

	@Override
	/**
	 * method to calculate shipping cost
	 */
	public double load(double n) {
		try {
			if(n>100) {
				throw new PackageException();
			}
		} catch (PackageException e) {
			System.out.println(e.getMessage());
			System.out.println(this.toString());
		}
		return n;
	}

	@Override
	/**
	 * this method shows information about the object of this class
	 */
	public String toString() {
		return "MetalCrate [trackingNum=" + trackingNum + ", weight=" + weight + "lbs, shippingCost=$" + shippingCost + "]";
	}

	
	
}
