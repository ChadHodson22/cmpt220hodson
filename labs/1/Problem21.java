import java.util.Scanner;
public class Problem21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Eneter a degress in celsius. ");
		double celsius = input.nextDouble();
		double fahrenheit = (9.0/5.0) * celsius + 32;
		System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees 	fahrenheit" );
 	}
}
