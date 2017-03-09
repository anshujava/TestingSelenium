package practice;

public class three_ReverseArray {
	public static void main(String[] args)
		   {
		String[] x = new String[]{"My","Leg","is","cut"};
		
		three_ReverseArray rev = new three_ReverseArray();
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
