package practice;

import java.util.Arrays;

public class fourtyone_compareTwoArrays {
	public static void main(String args[]){
//		String a [] = new String []{"b","a","c","e","d"};
//		String b [] = new String []{"b","a","c","f","d"};
		int a [] = new int []{1,4,3};
		int b [] = new int []{5,3,1,2,6};
		Arrays.sort(a);
		Arrays.sort(b);
		boolean foundSwitch = false;
		for(int i =0;i<a.length;i++){
			for(int j =0;j<b.length;j++){
				if( a[i]==(b[j]))
				{
			foundSwitch = true;
				System.out.println( "arrayA element " + a[i] + " was found in arrayB" );
		}
		}
		if (foundSwitch == false)
		{
			System.out.println( "arrayA element " + a[i] + " was not found in arrayB" );
		}
				//set foundSwitch bool back to false
		foundSwitch = false;
		}
		}
	}
