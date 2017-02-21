import java.util.Scanner;
public class Problem711 {
	static final int SIZE = 10;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] num = new double[SIZE];
		System.out.print("Enter " + SIZE + " numbers: ");
		for (int i = 0; i < num.length; i++) num[i] = input.nextDouble();

		System.out.println("The mean is " + mean(num));
		System.out.println("The SD is " + standardDeviation(num));
	}
	public static double standardDeviation(double[] x) {

		double mean = mean(x);
		double deviation = 0;
		for (int i = 0; i < x.length; i++) {
			deviation += Math.pow(x[i] - mean, 2);
		}
		return Math.sqrt(deviation / (x.length - 1));
	}
	public static double mean(double[] x) {
		double total = 0;
		for (int i = 0; i < x.length; i++) {
			total += x[i];
		}
		System.out.println(total);
		return total / x.length;
	}
}
