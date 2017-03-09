package practice;

public class two_ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Hello how are you";
		//System.out.println("reverse is ::::->"+reverseStr(str));
		System.out.println("reverse is ::::->"+reverseRecursively(str));
		
	}
	public static String reverseStr(String s){
	String reverse ="";
	for(int i = s.length()-1;i>=0;i--){
		reverse = reverse + s.charAt(i);
	}
	
	return reverse;
	}
	
	public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }


}
