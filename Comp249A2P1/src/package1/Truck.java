// -----------------------------------------------------
// Course: COMP249
// Assignment (2)
// Part: (1)
// Written by: (Name: Ibrahim Elyyan)
// -----------------------------------------------------


package package1;

/**
 * The truck class is used so packages can be loaded on it, then it will transport the packages
 * @author ibrahim_elyyan
 *
 */
public class Truck {
	// Declaring variables
	String driverName, originalCity, destinationCity;
	double gross, unloadedWeight, loadedWeight;
	public int numPackages;
	Package [] shipments = new Package[numPackages];
	/**
	 * Constructor that initializes variables of the class
	 */
	public Truck() {
		driverName = "Unknown"; 
		originalCity = "Unknown";
		destinationCity = "Unknown";
		gross = 0;
		unloadedWeight = 0;
		loadedWeight=0;
		numPackages = 0;
	}
	/**
	 * Parameterized constructor that initialize all the attributes of the created object from Truck
	 * @param driverName is the name of the driver
	 * @param originalCity is the origin city of the truck
	 * @param destinationCity is the origin city of the truck
	 * @param unloadedWeight is the unloaded weight of the truck
	 */
	public Truck(String driverName, String originalCity, String destinationCity, double unloadedWeight) {
		this.driverName = driverName;
		this.originalCity = originalCity;
		this.destinationCity = destinationCity;
		this.unloadedWeight = unloadedWeight;
		loadedWeight=unloadedWeight;;
		gross = 0;
		numPackages = 0;
	}
	
	/**
	 * Copy constructor creates a copy of the variables 
	 * @param driverName
	 * @param originalCity
	 * @param destinationCity
	 * @param gross
	 * @param unloadedWeight
	 * @param loadedWeight
	 * @param numPackages
	 * @param shipments
	 */
	public Truck(Truck truck) {
		super();
		this.driverName = truck.driverName;
		this.originalCity = truck.originalCity;
		this.destinationCity = truck.destinationCity;
		this.gross = truck.gross;
		this.unloadedWeight = truck.unloadedWeight;
		this.loadedWeight = truck.loadedWeight;
		this.numPackages = truck.numPackages;
		this.shipments = truck.shipments;
	}

	/**
	 * This method gives the driver's name
	 * @return returns drivers name
	 */
	public String getDriverName() {
		return driverName;
	}

	/**
	 * This method allows you to change/set the driver's name
	 * @param driverName
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	/**
	 * This method gives you the city of origin of the truck
	 * @return returns the city of origin of the truck
	 */
	public String getOriginalCity() {
		return originalCity;
	}

	/**
	 * This method allows you to determine what the city of origin is
	 * @param originalCity
	 */
	public void setOriginalCity(String originalCity) {
		this.originalCity = originalCity;
	}

	/**
	 * This method gives you the destination of the truck
	 * @return returns the destination of the truck
	 */
	public String getDestinationCity() {
		return destinationCity;
	}

	/**
	 * This method allows you to determine where the truck is headed
	 * @param destinationCity
	 */
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	/**
	 * this method gives you the gross
	 * @return returns the gross value
	 */
	public double getGross() {
		return gross;
	}

	/**
	 * This method allows you to set the gross
	 * @param gross
	 */
	public void setGross(double gross) {
		this.gross = gross;
	}

	/**
	 * this method gives you the unloaded weight
	 * @return returns unloaded weight of the truck
	 */
	public double getUnloadedWeight() {
		return unloadedWeight;
	}
	/**
	 * this method allows you to set the unloaded weight of the truck
	 * @param unloadedWeight
	 */
	public void setUnloadedWeight(double unloadedWeight) {
		this.unloadedWeight = unloadedWeight;
	}
	/**
	 * this method allows you to loaded weight of the truck
	 * @return returns loaded weight of the truck
	 */
	public double getLoadedWeight() {
		return loadedWeight;
	}
	/**
	 * this method allows you to set the loaded weight
	 * @param loadedWeight
	 */
	public void setLoadedWeight(double loadedWeight) {
		this.loadedWeight = loadedWeight;
	}
	/**
	 * this method allows you to get the number of packages
	 * @return returns number of packages
	 */
	public int getNumPackages() {
		return numPackages;
	}
	/**
	 * this method allows you to set the number of packages
	 * @param numPackages
	 */
	public void setNumPackages(int numPackages) {
		this.numPackages = numPackages;
	}
	
	/**
	 * 
	 * @param n is the weight in pounds
	 * @return converts the weight from pounds to kg
	 */
	public static double toKilograms(double n) {
		n = 2.2046*n;
		return n;
	}
	/**
	 * 
	 * @param n weight in kg
	 * @return from kg to pounds
	 */
	public static double toPounds(double n) {
		n = n/2.2046;
		return n;
	}

	@Override
	/**
	 * this method shows information about the object of this class
	 */
	public String toString() {
		return "Truck [driverName=" + driverName + ", originalCity=" + originalCity + ", destinationCity="
				+ destinationCity + ", gross=" + gross + ", unloadedWeight=" + unloadedWeight + ", numPackages="
				+ numPackages + "]";
	}
	
}
