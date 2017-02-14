
public class Problem612 {
	public static void main(String[] args) {
		final int NUMBER_OF_CHARS_PER_LINE = 10; 
		char ch1 = '1';	
		char ch2 = 'z';	

		System.out.println("Characters from 1 to Z");
		printChars(ch1, ch2, NUMBER_OF_CHARS_PER_LINE);
		System.out.println();
	}
                                     
	public static void printChars(char ch1, char ch2, int
	numberPerLine) {
		for (char i = ch1, count = 1; i <= ch2; i++, count++) {
			if (count % numberPerLine == 0)
				System.out.println(i);
			else
				System.out.print(i + " ");
		}
	}
}