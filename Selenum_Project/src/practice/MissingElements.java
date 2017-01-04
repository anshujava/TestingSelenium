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
	3. according to below logic sumOfNnumberss is 7*(7+1)/2=28
	sumOfElements = 1+2+3+5+6+7=24
	missing element is = 28-24=4
*/
//		int ar [] = new int[]{1,2,3,5,6,7};
//		int n = ar.length+1;
//		int total = n*(n+1)/2;
//		for(int i =0;i<ar.length;i++){
//			total -=ar[i];
//			
//		}
//		System.out.println(total);
	    
	    
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
