package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class twentythree_CuntWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String sentence = "i am a boy i am studying in school";
		 String[] words = sentence.split(" ");
		 Arrays.sort(words);
		 int count = 0;
	        List<Object> list = new ArrayList<Object>();
	        list.add(words);
	        for(int k=0;k<words.length;k++){
	            if(!list.contains(words[k])){
	            	System.out.println(words[k]);
	                list.add(words[k]);
	            }
	        }
	        for(int i=0;i<list.size();i++){
	            for(int j=0;j<words.length;j++){
	                if(list.get(i).equals(words[j])){
	                    count++;
	                }
	            }
	            System.out.println("Occurrence of " + list.get(i).toString() + " is " + count + " times.");
	            count=0;
	        }
	}
		
	}

