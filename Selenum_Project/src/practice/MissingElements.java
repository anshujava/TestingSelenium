package practice;

public class MissingElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//First Way	
/*
	1. Get the sum of numbers 
	       total = n*(n+1)/2
	2  Subtract all the numbers from sum and
	   you will get the missing number.
*/
//		int a[] = {1,2,4,5,6};
//		int n = a.length+1;
//		int total  = n*(n+1)/2;   
//	    for ( int i = 0; i< a.length; i++)
//	       total -= a[i];
//	    System.out.println(""+total);
	    
	    
//2nd Way
		int ar[] = {1,2,4,5,6};
//		 System.out.print("given array(already sorted): ");
//         for (int j = 0; j < ar.length; j++)
//                System.out.print(ar[j] +" "); // display it
//         
//         System.out.print("\nNumbers missing between 1 to 100 in array :  ");
         
         int j=0;
         for(int i=1;i<=10;i++){
                if(j<ar.length && i==ar[j])
                      j++;
                else
                      System.out.print(i+" ");
                
                
  }
	    
	}

}
