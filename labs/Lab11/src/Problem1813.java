import java.util.Scanner;
public class Problem1813 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] array = new int[8];
		int number;
		
		for(int i=0; i<8; i++) {
			System.out.print("Enter number "+(i+1)+": ");
			number = input.nextInt();
			array[i]=number;
		}
		int largest = largestNumber(array, array.length-1, array[array.length-1]);
		System.out.println("\nThe largest integer in the given numbers: "+largest);
	}
	public static int largestNumber(int[] array, int size, int currentValue) {
		if(size == 0) {
			if (currentValue < array[size]) {
				return array[size];
			}
			else return currentValue;
		}
		else {
			if (currentValue < array[size])
				currentValue = array[size];
			size--;
			return largestNumber(array, size, currentValue);
		}
	}
}
