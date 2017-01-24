import java.util.Scanner;
public class Problem29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter starting velocity, ending velocity and the speed ");
		double v0 = input.nextDouble(); 
		double v1 = input.nextDouble();
		double time = input.nextDouble();
		System.out.print("The average acceleration is " + (v1 - v0) / time);
		
	}

}
