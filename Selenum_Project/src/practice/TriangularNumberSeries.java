package practice;

public class TriangularNumberSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// output:::1,3,6,10,15,21,28.......
		for (int i = 1 ; i < 8 ; i++) {  
	          
	        int n = i*(i+1)/2;  
	        System.out.println( "n="+i+" triangle number="+n );  
	    }
	}

}
