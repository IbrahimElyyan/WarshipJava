// -----------------------------------------------------
// Course: COMP249
// Assignment (2)
// Part: (2)
// Written by: (Name: Ibrahim Elyyan)
// -----------------------------------------------------

package package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;
/**
 * Driver class
 * @author ibrahim_elyyan
 *
 */
public class WarshipInventory1 extends Warship implements Serializable {
	// Declaring static class field
	static Warship wsArr[];
	/**
	 * Adjusts serial number correctly
	 * @param input_filename the name of the input file
	 * @param output_filenamethe name of the output file
	 * @throws IOException
	 */
	public static void fixInventory(String input_filename, String output_filename) throws IOException {
		// Declaring multiple scanners for different purposes 
		Scanner key = new Scanner(System.in);
		long x;
		File file = new File(input_filename);
		File file2 = new File(output_filename);
		// scanner to read the file
		Scanner c = null;
		try {
			c = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println(e);;
		}
		// setting the size of the array to the number of records
		Warship[] wsArr = new Warship[countFileLines(input_filename)];
		// copying contents of the file onto warship objects
		for(int i=0; i<wsArr.length;) {
			while(c.hasNext()) {
				long sNum = c.nextLong();
				String tag = c.next();
				int year = c.nextInt();
				String country = c.next();
				double cost = c.nextDouble();
				int pace = c.nextInt();
				wsArr[i] = new Warship(sNum,tag,year,country,cost,pace);
				i++;
			}
		}
		System.out.println("The file has " + countFileLines(input_filename) + " records.");
		// checking for duplicates
		for(int i=0; i<wsArr.length; i++) {
			for (int j=0; j<wsArr.length; j++) {
				try {
					 if(wsArr[i].getSerialNum()==wsArr[j].getSerialNum() && i!=j) {
						System.out.print("Duplicate serial number detected in record #" + (j+1) + ". Pleas enter the correct serial number: ");
						x = key.nextInt();
						wsArr[j].setSerialNum(x);
						throw new DuplicateSerialNumberException();
					}
				} catch (DuplicateSerialNumberException e) {
					System.out.println(e);
				}
			}
		}
		System.out.println();
		// displaying contents of input file
		System.out.println("Here are the contents of Initial_Warship_Info.txt AFTER copying operation:");
		try {
			displayFileContents(file);
		} catch (FileNotFoundException e) {
			System.out.println(e);;
		}
		System.out.println();
		
		// writing the objects with the new serial numbers into the output file then displaying contents of output file
		System.out.println("Here are the contents of " + output_filename + ":");
		BufferedWriter bw = null;
		bw = new BufferedWriter(new FileWriter(output_filename));
		for (int i = 0; i < wsArr.length; i++) {
			bw.write(wsArr[i]+"\n");
		}
		bw.flush();  
		bw.close();  
		key.close();
		try {
			displayFileContents(file2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);;
		}
	}
	/**
	 * Displays the contents of the file
	 * @param file1 the file that will be displayed
	 * @return returns the contents of the file
	 * @throws FileNotFoundException
	 */
	public static File displayFileContents(File file1) throws FileNotFoundException {
		Scanner sc = new Scanner(file1);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		return file1;
	}

	/**
	 * Counts the number of lines/records of the file
	 * @param fileName name of the file
	 * @return returns the number of lines/records of the file
	 */
	public static int countFileLines(String fileName) {

		int lines = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			while (reader.readLine() != null) lines++;
		} catch (IOException e) {
			System.out.println(e);
		}
		return lines;

	}

	public static void main(String[] args)  {
		File file = new File("/Users/ibrahim_elyyan/Desktop/Initial_Warship_Info.txt");
		String outputName;
		Scanner key = new Scanner(System.in);
		// prompting the user for the name of the output file
		System.out.print("Please enter the name of output file, which will have the current information: ");
		outputName = key.next();
		// validating name
		while(outputName.equals("Initial_Warship_Info.txt")) {
			System.out.println("Error there is an existing file called: " + outputName);
			System.out.println("The file already has a size of " + file.length() + " bytes");
			System.out.println();
			System.out.print("Please enter the name of output file, which will have the current information: ");
			outputName = key.next();
		}
		System.out.println();
		// calling on method to fix inventory
		try {
			fixInventory("/Users/ibrahim_elyyan/Desktop/Initial_Warship_Info.txt", outputName);
		} catch (IOException e) {
			System.out.println(e);
		}
		key.close();
	}

}	
