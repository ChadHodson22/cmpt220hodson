import java.util.Scanner;
public class Problem516 {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter an integer ");
	int num = input.nextInt();
	
		for (int i = 2; i < num; i ++) {
			if (num % i == 0) {
				System.out.print(i + ", ");
			}
		}
	}
}
