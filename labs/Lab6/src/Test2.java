import java.text.DecimalFormat;
import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		double e = 0.0;
		double f = 0.0;
		DecimalFormat gh = new DecimalFormat("##.##");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value of a: ");
		String num = input.next();
		a = Double.parseDouble(num);
		
		System.out.print("Enter the value of b: ");
		String num1 = input.next();
		b = Double.parseDouble(num1);
		
		System.out.print("Enter the value of c: ");
		String num11 = input.next();
		c = Double.parseDouble(num11);
		
		System.out.print("Enter the value of d: ");
		String num111 = input.next();
		d = Double.parseDouble(num111);
		
		System.out.print("Enter the value of e: ");
		String num1111 = input.next();
		e = Double.parseDouble(num1111);
		
		System.out.print("Enter the value of f: ");
		String num11111 = input.next();
		f = Double.parseDouble(num11111);
		
		LinearEquation ij = new LinearEquation(a,b,c,d,e,f);
		if(ij.isSolvable()) {
			System.out.println("X = " + gh.format(ij.getX()));
			System.out.println("Y = " + gh.format(ij.getY()));
		} 
		else {
			System.out.println("The equation has no solution.");
		}
	}
}