import java.util.Scanner;
public class Problem1817 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter characters in one line: ");
		String str = input.nextLine();
		char[] array = str.toCharArray();
		System.out.print("\nPlease enter a character to the find number of its occurrences: ");
		String str1 = input.next();
		char ch = str1.charAt(0);
		int occrs = count(array, ch);
		System.out.println("\nThe number of occurrences of specified character in the given array: "+ occrs);
	}
	public static int count(char[] chars, char ch) {
		return count(chars, ch, chars.length-1);
	}
	public static int count(char[] chars, char ch, int high) {
		if (high >= 0) {
			int count = 0;
			char ch1 = chars[high];
			if(Character.toUpperCase(ch) == Character.toUpperCase(ch1))
				count++;
			return count + count(chars, ch, high-1);
		}
		else
			return 0;
	}

}
