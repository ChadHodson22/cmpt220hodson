import java.util.Scanner;
public class Problem32 {
		public static void main(String[] args) {
			int number1 = (int)(System.currentTimeMillis() % 10); //generates random number 1
			int number2 = (int)(System.currentTimeMillis() / 7 % 10); //generates random number 2
			int number3 = (int)(System.currentTimeMillis() / 7 / 7 % 10); //generates random number 3
			Scanner input = new Scanner(System.in);
			System.out.println( "What is " + number1 + " + " +  number2 + " + " + number3 + " ? ");
			int answer = input.nextInt();
			System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3 == answer));
			
		}

	}

