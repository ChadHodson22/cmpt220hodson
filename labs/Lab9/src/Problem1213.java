import java.io.File;
import java.util.Scanner;
public class Problem1213 {
	public static void main(String[] args) throws Exception {
		if(args.length !=1) {
			System.out.println("command-line argument is missing!");
			System.exit(1);
		}
		String fileName = args[0];
		File source = new File(fileName);
		if(!source.exists()) {
			System.out.println(fileName+" file does not exist!");
			System.exit(2);;
		}
		Scanner infile = new Scanner(source);
		String line;
		int characterCount = 0;
		int wordsCount = 0;
		int linesCount = 0;
		while(infile.hasNextLine()) {
			line = infile.nextLine();
			linesCount++;
			String[] words = line.split(" ");
			wordsCount += words.length;
			for(String token: words) {
				characterCount =+ token.length();
			}
		}
		System.out.println("Name of the input file: "+fileName);
		System.out.println("Number of lines in the file: "+ linesCount);
		System.out.println("Number of words in the file: "+ wordsCount);
		System.out.println("Number of characters in the file: "+ characterCount);
	}
}
