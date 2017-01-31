import java.util.Scanner;
public class Problem49 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a character: ");
	char letter = input.next().charAt(0);
	System.out.println("The Unicode for the character " + letter + " is " + (int)letter  );

	}
	
}
