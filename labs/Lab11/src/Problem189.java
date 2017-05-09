import java.util.Scanner;
public class Problem189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print("Enter a String: ");
			Scanner input = new Scanner(System.in);
			String str = input.next();
			System.out.print("The reverse String is: ");
			reverseDisplay(str);
		}
		catch(Exception e) {
			System.out.println("Exception has occurred in the class. Program will exit. ");
			System.exit(0);
		}
	}
	public static void reverseDisplay(String value) {
		if(value.length() > 0) {
			System.out.print(value.charAt(value.length()-1));
			reverseDisplay(value.substring(0, value.length()-1));
		}
	}

}
