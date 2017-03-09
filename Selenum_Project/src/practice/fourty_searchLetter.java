package practice;

import java.util.ArrayList;
import java.util.List;

public class searchLetter {
	public static void main(String args[]){  
		String str = "hello how are you";
		List ls = new ArrayList();
		ls.add(str);
		int count = 0;
	    for (int i = 0; i < ls.size(); i++){
	        if (ls.get(i).toString() != null){
	            String textValue = ls.get(i).toString();
	            for (int j = 0; j < textValue.length(); j++){
	                if (textValue.charAt(j) == ('h')){
	                    count++;
	                }
	            }
	        }
	    }
	   System.out.println(count);
		
	}  
	
	    }