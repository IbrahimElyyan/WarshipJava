// -----------------------------------------------------
// Course: COMP249
// Assignment (2)
// Part: (2)
// Written by: (Name: Ibrahim Elyyan)
// -----------------------------------------------------

package package1;
/**
 * Warship is the class that will be instantiated 
 * @author ibrahim_elyyan
 *
 */
public class Warship {
	// declaring variables
	protected long serialNum;
	String name;
	int creationYear;
	String ownerCountry;
	double price;
	int speed;
	
	public Warship() {
		serialNum=0;
		name=null;
		creationYear=0;
		ownerCountry=null;
		price=0;
		speed=0;
	}
	/**
	 * @param serialNum serial number
	 * @param name
	 * @param creationYear year the warship was created
	 * @param ownerCountry the country that owns the warship
	 * @param price the price of the warship
	 * @param speed the speed of the warship
	 */
	public Warship(long serialNum, String name, int creationYear, String ownerCountry, double price, int speed) {
		super();
		this.serialNum = serialNum;
		this.name = name;
		this.creationYear = creationYear;
		this.ownerCountry = ownerCountry;
		this.price = price;
		this.speed = speed;
	}
	/**
	 * Copy constructor creates a copy of the variables 
	 * @param warship object of this class
	 */
	public Warship(Warship warship) {
		super();
		this.serialNum = warship.serialNum;
		this.name = warship.name;
		this.creationYear = warship.creationYear;
		this.ownerCountry = warship.ownerCountry;
		this.price = warship.price;
		this.speed = warship.speed;
	}
	/**
	 * gets serial number
	 * @return returns serial number
	 */
	public long getSerialNum() {
		return serialNum;
	}
	/**
	 * sets serial number
	 * @param serialNum
	 */
	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}
	/**
	 * gets name
	 * @return returns name
	 */
	public String getName() {
		return name;
	}
	/**
	 * sets name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * gets the year of creation
	 * @return returns the year of creation
	 */
	public int getCreationYear() {
		return creationYear;
	}
	/**
	 * sets the year of creation
	 * @param creationYear
	 */
	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}
	/**
	 * gets the country that owns the warship
	 * @return returns the country that owns the warship
	 */
	public String getOwnerCountry() {
		return ownerCountry;
	}
	/**
	 * sets the country that owns the warship
	 * @param ownerCountry
	 */
	public void setOwnerCountry(String ownerCountry) {
		this.ownerCountry = ownerCountry;
	}
	/**
	 * gets price
	 * @return returns price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * sets price
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * gets speed
	 * @return returns speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * sets speed
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	/**
	 * this method shows information about the object of this class
	 */
	public String toString() {
		return serialNum + " " + name + " " + creationYear
				+ " " + ownerCountry + " " + price + " " + speed;
	}
	
	
	
}

