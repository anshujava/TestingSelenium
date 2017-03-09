package practice;

public class ReverseArray {
	public static void main(String[] args)
		   {
		String[] x = new String[]{"My","Leg","is","cut"};
		
		ReverseArray rev = new ReverseArray();
		rev.reverseArray(x);
	}
	
	public String reverseArray(String [] s){
		 int i;
		    

		    for(i=s.length-1; i>=0; i--)
		    {
		       System.out.println("reverse "+s[i]);
		    }
			return null;

	}
}
