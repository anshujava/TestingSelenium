package practice;

public class one_Conversion {
	public static void main(String[] args) {
		one_Conversion conv = new one_Conversion();
		String strHeloo = conv.intToString(7);
		int j = 6;
		System.out.println("output after int to String::"+(strHeloo+j));
		
		int d = conv.StringToint("6");
		int p = 12;
		System.out.println("output after String to int::"+(d+p));
	}
	
	public String intToString(int x){
		String str = "";
		str = String.valueOf(x);
		return str;
		
	}
	
	public int StringToint(String x){
		int i = 0;
		i = Integer.parseInt(x);
		return i;
		
	}
//	Converting int value to String without using toString and parseInt method
	
//	Conversion from string to int can be done in a way similar to yours, 
//	but by multiplying the result by 10 at every step, without the need 
//	to calculate the i-th power for every digit:
		
	public int stringToInt1(String s)
	{
	  int r = 0;
	  for (int i = 0; i < s.length(); ++i)
	  {
	    if (i > 0)
	      r *= 10;

	    r += s.charAt(i)-'0';
	  }
	  return r;
	}
	
//	While conversion from int to string can take into account the 
//	difference between the char '0' and the current character of 
//	the string without the need of a if/else chain. In addition 
//	you can use a string buffer to insert characters at the beginning 
//	to avoid the necessity of reversing the string.
	
	public String intToString1(int i)
	{
	  StringBuilder b = new StringBuilder();

	  while (i != 0)
	  {
	    b.insert(0, (char)('0'+i%10));
	    i /= 10;
	  }

	  return b.toString();
	}
}
