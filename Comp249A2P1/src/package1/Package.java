// -----------------------------------------------------
// Course: COMP249
// Assignment (2)
// Part: (1)
// Written by: (Name: Ibrahim Elyyan)
// -----------------------------------------------------


package package1;
/**
 * Package is an abstract class that will be an outline to it's subclasses
 * @author ibrahim_elyyan
 *
 */
public abstract class Package {
	// declaring variables
	int trackingNum;
	double weight, shippingCost;
	/**
	 * Constructor that initializes variables of the class
	 */
	public Package() {
		trackingNum = 0;
		weight = 0;
		shippingCost = 0;
	}
	/**
	 * Parameterized constructor that initialize all the attributes of the created object from this class
	 * @param trackingNum is the tracking number
	 * @param weight is the weight
	 * @param shippingCost is the shipping cost
	 */
	public Package(int trackingNum, double weight) {
		this.trackingNum = trackingNum;
		this.weight = weight;
		calculateShippingCost();
	}
	/**
	 * gets the tracking number
	 * @return returns tracking number
	 */
	public int getTrackingNum() {
		return trackingNum;
	}
	/**
	 * sets tracking number
	 * @param trackingNum
	 */
	public void setTrackingNum(int trackingNum) {
		this.trackingNum = trackingNum;
	}
	/**
	 * gets weight
	 * @return returns weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * sets weight
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * gets shipping cost
	 * @return returns shipping cost
	 */
	public double getShippingCost() {
		return shippingCost;
	}
	/**
	 * sets shipping cost
	 * @param shippingCost
	 */
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}
	/**
	 * abstract method to calculate shipping cost
	 */
	public abstract void calculateShippingCost();
	/**
	 * abstract method to determine if package can be loaded into the truck
	 * @param n weight of the package
	 * @return
	 */
	public abstract double load(double n);
	/**
	 * from pounds to ounces
	 * @param n weight in pounds
	 * @return
	 */
	public static double toOunces(double n) {
		n = n*16;
		return n;
	}
	/**
	 * from ounces to pounds
	 * @param n weight in ounces
	 * @return
	 */
	public static double toPounds(double n) {
		n = n/16;
		return n;
	}
	
	@Override
	/**
	 * this method shows information about the object of this class
	 */
	public String toString() {
		return "Package [Weight=" + weight + ", shippingCost=" + shippingCost + "]";
	}
	
}
