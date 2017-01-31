import java.util.Scanner;
public class Problem420 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string ");
		String word = input.nextLine();
		System.out.println("The first character to " + word + " is " + word.charAt(0));
		System.out.println("The length of " + word + " is " + word.length());
	
	}
}
