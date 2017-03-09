package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShortingProgram {

	
	public static void main(String[] args) {
//		sortingArray();
		sortingArrayList();

	}
	
	public static void sortingArray(){
		
		String arr [] = new String[]{"D","B","A","C"};
		 for(int i=0; i < arr.length; i++){
            
             Arrays.sort(arr);
             System.out.println(" sorting::"+arr[i]);
             Arrays.sort(arr,Collections.reverseOrder());
             System.out.println(" sorting in descending order::"+arr[i]);
     }
		
	}
	
   public static void sortingArrayList(){
		List<String> arr = new ArrayList<String>();
		arr.add("X");
		arr.add("W");
		arr.add("Z");
		arr.add("Y");
		Collections.sort(arr);
		System.out.println("sorting::"+arr);
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println("descending sorting::"+arr);
		
	}
}
