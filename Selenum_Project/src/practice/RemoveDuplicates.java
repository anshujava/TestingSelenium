package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String str = "A B C D A E F";
//		String[] words = str.split(" ");
		String[] words = new String[]{"F","G","K","G","L","A"};
		 List list = new ArrayList();
	        list.add(words);
	        for(int k=0;k<words.length;k++){
	            if(!list.contains(words[k])){
	                list.add(words[k]);
	                System.out.println("##"+words[k]);
	            }
	            else{
//	            	System.out.println("duplicates::"+words[k]);
	            }
	        }
	        
	        	
	       

	}

}
