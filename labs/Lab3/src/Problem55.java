import java.util.Scanner;
// JA: You should add comments to your code
public class Problem55 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kilograms:   Pounds");
	
		// JA: The problem asked for having the two tables side by side. One kg -> lbs, the other lbs -> kg
		// JA: The first in increments of 2 and the second one in increments of 5
		for (double number = 0.0; number <= 100; number++) {
			System.out.println(number + "     :   " + (number * 2.2)); 
		}
	}
}	
	
	

