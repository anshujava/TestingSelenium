package practice;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Hello how are you";
		ReverseString rev = new ReverseString();
		rev.reverseStr(str);
		
	}
	public String reverseStr(String s){
	String reverse ="";
	for(int i = s.length()-1;i>=0;i--){
		reverse = reverse + s.charAt(i);
	}
	System.out.println("reverse is ::::->"+reverse);
	return reverse;
	}

}
