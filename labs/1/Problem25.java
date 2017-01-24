import java.util.Scanner;
public class Problem25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and gratuity rate" );
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		double gratuity = (gratuityRate * subtotal);
		System.out.println("The gratuity is " + (gratuity) + " and  the total is " + (subtotal + gratuity));
	}

}
