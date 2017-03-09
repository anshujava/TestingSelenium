package practice;

public class fourtythree_BubbleSort {
	/* 20		30		10		25		45
	 * a[0] 	a[1]	a[2]	a[3]	a[4]
	 * 
	 *  We will be searching for the integer 45.
	 *  First, find the middle of the array by adding the array subscript of the first value to the subscript of the last value and dividing by two:  
	 * (0 + 4) / 2 = 2    
	 *  Integer division is used to arrive at the 2nd subscript as the middle. 
	 *  The 2nd subscript holds the integer 10, which comes before 45. 
	 *  We know that 45 will be in that portion of the array to the right of 10.  
	 *  We now find the middle of the right portion of the array by using the same approach.  (3 + 4) / 2 = 3
	 *  The 3rd subscript holds the integer 25, which comes before 45.  
	 *  Now find the middle of the portion (4 + 4) / 2 = 4
	 *  so a[4] is matching with 45.
	 * 
	 */
	public static void main(String[] args) {
		 int arr[] ={3,60,35,2,45,320,5};  
         
         System.out.println("Array Before Bubble Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  
         System.out.println();  
           
         bubbleSort(arr);//sorting array elements using bubble sort  
          
         System.out.println("Array After Bubble Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  

 }  


	public static void bubbleSort(int[] arr) {  
		  int temp=0;
		  for(int i=0;i<=(arr.length)-1;i++)
		  {
		     for(int j=0;j<=(arr.length)-1;j++)
		     {
		         if(arr[i]<arr[j])
		            {
		              temp=arr[j];
		              arr[j]=arr[i];
		             arr[i]=temp;
		           }
		     }
		  }

	}
}
