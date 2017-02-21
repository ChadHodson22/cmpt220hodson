import java.util.Scanner;
public class Prolem710 {
	static final int SIZE = 10;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] num = new double[SIZE];
		System.out.print("Enter " + SIZE + " numbers: ");
		for (int i = 0; i < num.length; i++) num[i] = input.nextDouble();
		System.out.println("The index of the smallest number is: " + smallestElement(num));
	}
	public static double smallestElement(double[] array) {
		int index = 0;
		double low = array[index];
		for (int i = 0; i < array.length; i++) {

			if (low > array[i]) {
				low = array[i];
				index = i;
			}
		}
		return index;
	}
}

