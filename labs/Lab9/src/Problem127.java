import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problem127 {
	public class problem12_7 {
		public void main(String[] args) throws IOException{
			try {
				BufferedReader bf = new BufferedReader (new
						InputStreamReader(System.in));
				System.out.print("enter the binary value: ");
				String str = bf.readLine();
				int i = binaryToDecimal(str);
				System.out.println("Decimal := "+ i);
			}
			catch(NumberFormatException ex) {
				System.out.println("Number Format Exception occured.program will exit");
				System.out.println(ex.getMessage());
				System.exit(0);
			}
		}
		public int binaryToDecimal(String binaryString) {
			int decimalValue = 0;
			for(int i=0; i<binaryString.length(); i++) {
				Character binaryChar = binaryString.charAt(i);
				String tempStr = binaryChar.toString();
				int tempInt = Integer.parseInt(tempStr);
				if(tempInt !=0 && tempInt !=1) {
					System.out.println("Invalid binary number entered. Program will exit. ");
					System.exit(0);
				}
				decimalValue = decimalValue * 2 + tempInt;
			}
			return decimalValue;
		}

	}
}
