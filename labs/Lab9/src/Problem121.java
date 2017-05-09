
public class Problem121 {
	public static void main(String[] args) {
		if(args.length !=1) {
			System.out.println("please use format: java Exercise 12_1 operand1 OPERATOR(+ or - or * or /) operand2");
					System.exit(0);
		}
		int result = 0;
		int a,b;
		a=Integer.valueOf(args[0].charAt(0))-48;
		b=Integer.valueOf(args[0].charAt(2))-48;
		try {
			switch (args[0].charAt(1)) {
			case'+':result = a+b;
			break;
			case '-': result = a-b;
			break;
			case'*': result = a*b;
			break;
			case'/': result = a/b;
			break;
			}
			if(Character.isDigit(args[0].charAt(0))&&Character.isDigit(args[0].charAt(2))&&
					(args[0].charAt(1)=='+' || args[0].charAt(1)=='-' ||
					args[0].charAt(1)=='*' ||
					args[0].charAt(1)== '/')) {
				System.out.println(a+" "+ args[0].charAt(1)+" "+b+"=" +result);
			}
			else if(Character.isLetter(args[0].charAt(0))|| args[0].charAt(0)=='+'||
					args[0].charAt(0)=='-' || args[0].charAt(0)=='*' ||
					args[0].charAt(0)=='/') {
				System.out.println("Wrong input: "+args[0].charAt(0));
			}
			else
				if(Character.isDigit(args[0].charAt(0))&&Character.isLetter(args[0].charAt(1))) {
					System.out.println("Wrong input:"+args[0].charAt(0)+""+args[0].charAt(1));
				}
				else
					if(Character.isDigit(args[2].charAt(2))&&Character.isLetter(args[0].charAt(1))||Character.isDigit(args[0].charAt(1))) {
						System.out.println("Wrong input: "+args[0].charAt(1)+""+args[0].charAt(2));
					}
					else if(Character.isLetter(args[0].charAt(2))||args[0].charAt(2)=='+'||
							args[0].charAt(2)=='-'|| args[0].charAt(2)=='*'|| args[0].charAt(2)=='/') {
						System.out.println("wrong input: "+args[0].charAt(2));
					}
		}
		catch (NumberFormatException nfe) {
			String message = nfe.getMessage();
			System.out.println(message);
		}
	}
}
