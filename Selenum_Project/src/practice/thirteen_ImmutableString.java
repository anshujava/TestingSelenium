package practice;

public class ImmutableString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String s="Sachin";  
		   s.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(s);//will print Sachin because strings are immutable objects  
		   String s1=s.concat(" Tendulkar");
		   System.out.println(s1);
	}

}
