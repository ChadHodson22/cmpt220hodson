import java.util.Scanner;
public class Problem1811 {
	static int sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print("Enter the number: ");
			Scanner input = new Scanner(System.in);
			String str = input.next();
			int num = Integer.parseInt(str);
			System.out.print("The sum is: "+sumDigits(num));
		}
		catch(Exception e) {
			System.out.println("Exception has occurred. Program will exit. ");
			System.exit(0);
		}
	}
	public static int sumDigits(long n) {
		if(n > 0) {
			sum = sum+(int)n%10;
			sumDigits(n/10);
		}
		return sum;
	}
}
