import java.util.Scanner; 
public class Test105 {
	public static void main(String[] args) {
		Problem105 df = new Problem105();
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an Integer ");
		int num = scan.nextInt();
		System.out.println("The prime factors for the given number " + num + " is");
		
		int factor = 2;
		while (factor <= num) {
			if (num % factor == 0) {
				num = num / factor;
				df.push(factor);
				count++;
			} else {
				factor++;
			}
		}
		for (int i=0; i<=count; i++)
			System.out.print(df.pop()+" ");

	}

}

