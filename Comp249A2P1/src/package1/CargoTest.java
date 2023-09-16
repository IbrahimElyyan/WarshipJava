// -----------------------------------------------------
// Course: COMP249
// Assignment (2)
// Part: (1)
// Written by: (Name: Ibrahim Elyyan)
// -----------------------------------------------------

package package1;

import java.util.Scanner;


/**
 * This is the driver class
 * @author ibrahim_elyyan
 *
 */
public class CargoTest {

	public static void main(String[] args) {
		// Declaring variables
		int mainSelection=0, choice, count=0;
		double weight2;
		Scanner key = new Scanner(System.in);
		String subSelection = null;
		// Instantiate a truck, with its driver, unloaded weight and both the originating and destination cities
		Truck truck = new Truck("Rick", "Montreal", "Toronto", 40000);
		Package[] Packages = new Package[200];

		do {
			// Prompting the user for what they would like to do by presenting this menu of options
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.print("1. Start a cargo\n"
					+ "\ta. Driver name\n"
					+ "\tb. Unload weight(kg; lb)\n"
					+ "\tc. Originating city\n"
					+ "\td. Destination city\n"
					+ "2. Load the truck with packages\n"
					+ "\ta. Package tracking number\n"
					+ "\tb. Package weight(oz; lb)\n"
					+ "\tc. Package shipping cost\n"
					+ "3. Unload a package\n"
					+ "4. The number of packages loaded\n"
					+ "5. The gross income earned by shipping of the cargo\n"
					+ "6. Weight the truck(after it has been completely loaded)\n"
					+ "7. Drive the truck to destination\n"
					+ "0. To quit\n"
					+ "Please enter your choice and press <Enter>: ");
			mainSelection = key.nextInt();
			// Using switch case to determine result
			switch (mainSelection) {
			// Presenting truck information
			case 1: 
				System.out.println();
				System.out.print("You chose option " + mainSelection + ", choose one a,b,c, or d: ");
				subSelection = key.next();
				if(subSelection.equalsIgnoreCase("a")) {
					System.out.print("The truck driver's name is: " + truck.getDriverName());
					System.out.println();
				} else if(subSelection.equalsIgnoreCase("b")) {
					System.out.println("Unloaded weight of the truck is: " + truck.getUnloadedWeight());
					System.out.println();
				} else if(subSelection.equalsIgnoreCase("c")) {
					System.out.print("Origin city of the truck: ");
					System.out.println(truck.getOriginalCity());
					System.out.println();
				} else if(subSelection.equalsIgnoreCase("d")) {
					System.out.print("Destination city of the truck: ");
					System.out.println(truck.getDestinationCity());
					System.out.println();
				} 
				System.out.println();
				break;
				// Loading a package in the truck
			case 2:
				System.out.println();
				key = new Scanner(System.in);
				System.out.println("You chose option " + mainSelection + ".");
				System.out.print("\ta. Please provide tracking number of package, please ensure that the number ends with 0,1,2, or 3: ");
				choice = key.nextInt();
				// Validating choice
				while(choice<0 || (choice%10)>3) {
					key = new Scanner(System.in);
					System.out.print("\ta. Please provide tracking number of package, please ensure that the number ends with 0,1,2, or 3: ");
					choice = key.nextInt();
				}
				System.out.print("\tb. Please provide the weight of the package in lbs: ");
				weight2 = key.nextDouble();
				// Checking the type of package and using the load method
				if (choice%10==0) {
					Packages[count] = new Letter(choice,Package.toOunces(weight2));
					truck.setNumPackages(truck.getNumPackages()+1);
					Packages[count].load(Package.toOunces(weight2));
					Packages[count].setWeight(weight2);
					if(weight2>32 || weight2<0) {
						truck.setNumPackages(truck.getNumPackages()-1);
						Packages[count] = null;
						break;
					}
				} else if(choice%10==1) {
					Packages[count] = new Box(choice,weight2);
					truck.setNumPackages(truck.getNumPackages()+1);
					Packages[count].load(weight2);
					if(weight2>40 || weight2<0) {
						truck.setNumPackages(truck.getNumPackages()-1);
						Packages[count] = null;
						break;
					}
				} else if(choice%10==2) {
					Packages[count] = new WoodenCrate(choice,weight2);
					truck.setNumPackages(truck.getNumPackages()+1);
					Packages[count].load(weight2);
					if(weight2>80 || weight2<0) {
						truck.setNumPackages(truck.getNumPackages()-1);
						Packages[count] = null;
						break;
					}
				} else if(choice%10==3) {
					Packages[count] = new MetalCrate(choice,weight2);
					truck.setNumPackages(truck.getNumPackages()+1);
					Packages[count].load(weight2);
					if(weight2>100 || weight2<0) {
						truck.setNumPackages(truck.getNumPackages()-1);
						Packages[count] = null;
						break;
					}
				}
				// Displaying shipping cost
				System.out.println("\tc. This package's shipping cost is: " + Packages[count].getShippingCost());
				truck.setGross(truck.getGross()+Packages[count].getShippingCost());
				truck.setLoadedWeight(truck.getLoadedWeight()+Packages[count].getWeight());
				count++;
				System.out.println();
				if(Packages[count]==null && count>0) {
					count--;
					break;
				} else if(Packages[count]==null && count==0) {
					count=0;
					break;
				}
				System.out.println();
				break;
			case 3:
				System.out.println();
				key = new Scanner(System.in);
				System.out.println("You chose option " + mainSelection + ".");
				if(truck.getNumPackages()==0) {
					System.out.println("There are no packages to unload!");
					break;
				}
				System.out.print("Enter tracking number of package you want to unload: ");
				choice = key.nextInt();
				for (int i=0;i<Packages.length;i++) {
					if (Packages[i].getTrackingNum()==choice) {
						Packages[i]=null;
						// Unloading the package
						truck.setNumPackages(truck.getNumPackages()-1);
						System.out.println("Package " + choice + " has been unloaded.");
						break;
					}
				}
				System.out.println();
				break;
				
			// Displaying the number of packages
			case 4: 
				System.out.println();
				System.out.println("You chose option " + mainSelection + ".");
				System.out.println("The number of packages is: " + truck.getNumPackages());
				System.out.println();
				break;
			// Displaying the number of gross	
			case 5: 
				System.out.println();
				System.out.println("You chose option " + mainSelection + ".");
				System.out.println("The gross income earned by shipping of the cargo: " + truck.getGross());
				System.out.println();
				break;
			// Displaying the loaded weight of the truck
			case 6:
				System.out.println();
				System.out.println("You chose option " + mainSelection + ".");
				System.out.println("The weight of the truck after it has been completely loaded is: " + truck.getLoadedWeight());
				System.out.println();
				break;
			// Shpping the packages		
			case 7: 
				System.out.println();
				System.out.println("Truck is headed to destination now ...");
				System.out.println("Montreal--------------------------------->Toronto");
				System.out.println("Truck has arrived at destination");
				for(int i=0; i<Packages.length;i++) {
					Packages[i]=null;
				}
				truck.setGross(0);
				truck.setLoadedWeight(truck.getUnloadedWeight());
				truck.setNumPackages(0);
				System.out.println();
				break;
			}
		} while (mainSelection!=0);
		key.close();
	}

}

