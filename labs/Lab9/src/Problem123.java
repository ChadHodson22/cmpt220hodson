import java.util.Scanner;
import java.util.Random;
public class Problem123 {
	public static void main(String[] args) {
		final int SIZE = 100;
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int[] arr = new int[SIZE];
		for(int i=0; i<SIZE;i++) {
			arr[i] = 1+rand.nextInt(100);
		}
		System.out.print("enter the index of the array: ");
		int index = input.nextInt();
		try {
			int value = arr[index];
			System.out.println("corresponding value at index "+index+" is "+value);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("out of bounds");
		}
	}

}
