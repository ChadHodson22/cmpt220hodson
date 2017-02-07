public class Problem61 {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.print(getPentagonalNumber(i) + " ");
			if (i % 10 == 0) {
				System.out.println("\n");
			}
		}
	}
	public static int getPentagonalNumber(int n) {
		int number = n * ((3 * n) - 1 ) / 2;
		return(number);
	}
}