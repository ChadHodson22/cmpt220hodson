
class myInteger {
int value;
	
	myInteger(int number) {
		value = number;
	}
	
	public int getValue() {
		return value;
	}
	
	public static boolean isEven(int n) {
		return (n%2 == 0); 
	}
	public static boolean isOdd(int n) {
		return !isEven(n);
	}
	public static boolean isPrime(int n) {
		for (int f = 2; f < n / 2; f++) {
			if(n % f == 0) {
				return false;
			}
		}
		return true;
	}
	public boolean isEven(myInteger n) {
		return n.isEven();
	}
	public boolean isOdd(myInteger n) {
		return n.isOdd(); 
	}
	public boolean isPrime(myInteger n) {
		return n.isPrime();
	}
	public boolean isEven() {
		return isEven(value);
	}
	public boolean isOdd() {
		return isOdd(value);
	}
	public boolean isPrime() {
		return isPrime(value);
	}
	public boolean equals(int n) {
		return (value == n);
	}
	public boolean equals(myInteger n) {
		return equals(n.getValue());
	}
	public static int parseInt(String s) {
		return Integer.parseInt(s);
	}
	public static int parseInt(char[] s) {
		return parseInt(new String(s));
	}
}
