import java.util.Scanner;
public class Problem26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000");
		int number = input.nextInt(); 
		int a1 = number % 10;
		int a2 = (number / 10) % 10; 
		int a3 = (number / 100); 
		
		System.out.println(a1 + a2 + a3);
		
		

		
		
	}

}
