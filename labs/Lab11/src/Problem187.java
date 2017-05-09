import java.util.Scanner;
public class Problem187 {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an index for a Fibonacci number: ");
		int index = input.nextInt();
		System.out.print("Enter the number at index " + index +" is "+ fib(index));	
		System.out.println("\nThe number of times the mehod is invoked: "+count);
	
	}
	
	public static long fib(long index) {
		count++;
		if (index == 0)
			return 0;
		else if (index == 1)
			return 1;
		else 
			return fib(index - 1) + fib(index - 2);
	}

}

