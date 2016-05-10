package practice;

public class StringEquals {

	
	public static void main(String[] args) {
		String s = "HELLO";
		String s1 = "HELLO";
		
		String s2 = new String("HELLO");
		String s3 = new String("HELLO");
		
		if (s == s1){
			System.out.println("== string");
		}
		if (s.equals(s1)){
			System.out.println("equals string");		
				}
		if (s2 == s3){
			System.out.println("== new string");
		}
		if (s2.equals(s3)){
			System.out.println("equals new string");	
		}

	}

}
