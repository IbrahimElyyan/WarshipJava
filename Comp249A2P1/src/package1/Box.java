// -----------------------------------------------------
// Course: COMP249
// Assignment (2)
// Part: (1)
// Written by: (Name: Ibrahim Elyyan)
// -----------------------------------------------------

package package1;

/**
 * Box is a type of package
 * @author ibrahim_elyyan
 *
 */
public class Box extends Package {
	/**
	 * Constructor that initializes variables of the class
	 */
	public Box() {
		super();
	}
	/**
	 * Parameterized constructor that initialize all the attributes of the created object from this class
	 * @param trackingNum is the tracking number
	 * @param weight is the weight
	 */
	public Box(int trackingNum, double weight) {
		super(trackingNum,weight);
		calculateShippingCost();
	}
	

	@Override
	/**
	 * method to calculate shipping cost
	 */
	public void calculateShippingCost() {
		this.shippingCost = 2*weight;
	}

	@Override
	/**
	 * method to determine if package can be loaded into the truck
	 * @param n weight of the package
	 * @return
	 */
	public double load(double n) {
		try {
			if(n>40) {
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
		return "Box [trackingNum=" + trackingNum + ", weight=" + weight + "lbs, shippingCost=$" + shippingCost + "]";
	}




}
