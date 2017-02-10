import java.util.Scanner;
public class Problem63 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter an integer ");
	int number = input.nextInt();
	int numRev = reverse(number); 
	}
	public static int reverse(int number) {
		String output = "";
		while (number >= 1) {
			int dig1 = (number % 10);
			number = number / 10;
			String digString = Integer.toString(dig1);
			output += digString;
			
		}
		int result = Integer.parseInt(output);
		return output; // JA: You cannot return a String in a method that should return an int.
	}
	public static boolean isPalindrome(int number) { // JA: Where is the logic?
		
		
	}
}
