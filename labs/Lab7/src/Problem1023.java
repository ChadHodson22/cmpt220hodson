
public class Problem1023 {

}
class mystring2 {
	private char[] chars;
	public mystring2(char[] chars) {
		this.chars = new char[chars.length];
		System.arraycopy(chars, 0, this.chars, 0, chars.length);
	}
	public int compare(mystring2 s) {
		return 1;
	}
	public mystring2 toUppercase() {
		char[] temp = new char[chars.length];
		for (int i=0; i < chars.length; i++) {
			temp[i] = Character.toUpperCase(chars[i]);	
		}
		return new mystring2(temp);
	}
	public static mystring2 valueOf(boolean k) {
		if(k) 
			return new mystring2(new char[] {'t', 'r', 'u', 'e'});
		else
			return new mystring2(new char[] {'f', 'a', 'l', 's', 'e'});
	}
	public mystring2 substring(int begin) {
		char[]  temp = new char[chars.length - begin];
		for (int i = begin; i < chars.length; i++) {
			temp[i - begin] = chars[i];
		}
		return new mystring2(temp);
	}
	public char[] toChars() {
		return chars;
	}
}
