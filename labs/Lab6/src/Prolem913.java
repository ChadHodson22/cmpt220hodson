import java.text.DecimalFormat;
import java.util.Scanner;
// JA: Always add comments to your code
// JA: This code looks exactly the same as another student in the class
public class Prolem913 {
	public static class Location {
		static double[][] myArray = null;
		public static int row = 0;
		public static int column = 0;
		public static double maxValue = 0;
		public static void main(String[] args) {
			System.out.print("Enter the number of rows and columns of the array: " );
			Scanner input = new Scanner(System.in);
			
			String sizeString = null;
			String arrayElements = null;
			String[] temp1 = null;
			String[] temp2 = null;
			sizeString = input.nextLine();
			temp1 = sizeString.split(" ");
			
			if(temp1.length != 2) {
				System.out.println("Either the Row or Column value was not entered. Program will exit. ");
						System.exit(0);
			}
			for(int i=0; i<temp1.length; i++) {
				if(Integer.parseInt(temp1[i]) <= 0 ) {
					System.out.println("Negative Row or Column value was entered. Program will exit. ");
							System.exit(0);
				}
			}
			row = Integer.parseInt(temp1[0]);
			column = Integer.parseInt(temp1[1]);
			myArray = new double [row][column];
			System.out.println("Enter the array: ");
			
			for(int i=0; i<row; i++) {
				arrayElements = input.nextLine();
				temp2 = arrayElements.split(" ");
				if(temp2.length != column) {
					System.out.println("Invalid number of entry in the array. Program will exit. ");
							System.exit(0);
				}
				for(int j=0; j<column; j++) {
					myArray[i][j] = Double.parseDouble(temp2[j]);
				}
				arrayElements = null;
			}
			locateLargest(myArray);
		}
		public static Location locateLargest(double[][] a) {
			DecimalFormat kl = new DecimalFormat("##.##");
			maxValue = a[1][1];
			int posI = 0;
			int posJ = 0;
			
			for(int i=0; i<row; i++) {
				for(int j=0; j<row; j++) { // JA: j<col
					if(a[i][j] > maxValue) {
						maxValue = a[i][j];
						posI = i;
						posJ = j;
					}
				}
			}
			System.out.println("The location of the largest element is: " +
					kl.format(maxValue) + " at" +
					" ("+posI +"," + posJ +") ");
			return new Location();
		}
	}
}
