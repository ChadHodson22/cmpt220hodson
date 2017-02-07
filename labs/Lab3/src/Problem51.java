import java.util.Scanner;
public class Problem51 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.print("Enter and integer  (the input ends if it is 0:) ");
			int data = input.nextInt();
			int sum = 0;
			int posInt = 0;
			int negInt = 0;
			int numOfInts = 0;
			
			
			if (data == 0) {
			System.out.println("No nummers are entered except 0");	
			}
			else{
				
				while(data !=0){
				sum += data;
				if (data < 0) {
					negInt++; 
					numOfInts++;
					sum = sum + data;
					System.out.print("Enter and integer) ");
					data = input.nextInt();
				}
				else if  (data > 0) {
					posInt++; 
					numOfInts++;
					sum = sum + data;
					System.out.print("Enter and integer  (the input ends if it is 0 ) ");
					data = input.nextInt();
				}
				
			}
			System.out.println("The sum is " + sum);
			System.out.println("The number of positive integers is " + posInt);
			System.out.println("The number of negative is " + negInt);
			System.out.println("The average of the integers is " + (sum / numOfInts));
		}
	}
}

