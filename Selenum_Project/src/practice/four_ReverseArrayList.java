package practice;

import java.util.ArrayList;


public class four_ReverseArrayList {
	 public static void main(String[] args) {
	      ArrayList<String> ls = new ArrayList<String>();
	      ls.add("ANSHU");
	      String[] countries  = new String[ls.size()];
	      for (int i = 0; i < ls.size(); i++) {
	          countries[i] = ls.get(i).toString();
	          two_ReverseString rev = new two_ReverseString();
	  		  rev.reverseStr(countries[i]);
	      }
	 }
	
}
