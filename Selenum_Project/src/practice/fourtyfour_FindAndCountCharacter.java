package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class fourtyfour_FindAndCountCharacter {
//	public static void main(String[] args) {
//		String str = "Programming";
//		HashMap<Character, Integer> map = new HashMap<>();
//		for (char ch : str.toCharArray()) {
//			if (map.containsKey(ch)) {
//				int val = map.get(ch);
//				map.put(ch, val + 1);
//			} else {
//				map.put(ch, 1);
//			}
//		}
//		System.out.println(map);
//	}
	 public static void main(String args[]){
         String word = "anshuman choudhury"; 
        
         for (int i=0;i<word.length();i++){
              boolean flag=false;
              for(int j=0;j<i;j++){			
                   if(word.charAt(i)==word.charAt(j)){
                        flag=true;
                   }    
              }
              if(flag==false){
            	  int count=0;
                   for(int k=i;k<word.length();k++){
                        if(word.charAt(i)==word.charAt(k)){
                             count++;
                        }
                   }
                   System.out.println(word.charAt(i)+"="+count+"times");
               }
         }
    }

}