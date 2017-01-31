import java.util.Scanner;
public class Problem413 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter ");
		char letter = input.next().charAt(0);
		
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
		System.out.println(letter + " is a vowel "); 
		}
		else if ((int)letter > 65 && (int)letter < 91 || (int)letter > 96 && (int)letter < 122) {
			System.out.println(letter + " is a consonant "); 
		}
		else { 
			System.out.println(letter + " is invalid "); 
		}
	
	}
}
	