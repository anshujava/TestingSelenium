package practice;

import java.util.Arrays;

public class findTwoHighestDistinctValues {

	public static void main(String[] args) {
		
        int[] numbers = {88,33,98,23,64,123};
      
        System.out.println("Largest number in array is : " +getTwoHighestDistinctValues(numbers));
    

}
public static int getTwoHighestDistinctValues(int[] array)
{
	int largestA = 0;
    int largestB = 0;

    for(int i = 0; i < array.length; i++){

            if(array[i] > largestA){
            	largestB = largestA;
                largestA = array[i];
            }
            if(array[i] < largestA){
                largestB = array[i];   
            }

    }
    System.out.println(largestA+" , "+largestB);
    return largestA + largestB; 
}
}