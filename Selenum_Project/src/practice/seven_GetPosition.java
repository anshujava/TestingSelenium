package practice;

import java.util.Arrays;

public class seven_GetPosition {
	public static void main(String[] args) {
		seven_GetPosition mp = new seven_GetPosition();
		System.out.println(mp.getPosition(27));
	}
	public int getPosition(int x){
		int[] arr = new int[]{18,20,25,27,28};
		int s = Arrays.binarySearch(arr, x);
		return s;
		
	}

}
