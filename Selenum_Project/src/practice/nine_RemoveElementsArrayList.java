package practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsArrayList {
	 public static void main(String[] args){
    	List<Integer> ls = new ArrayList<Integer>(10);
    	ls.add(4);
    	ls.add(6);
    	ls.add(7);
    	ls.add(8,22);  //it will add element 22 in 8 th position in array but here array size is 3
    	ls.remove(2);
    	
    	System.out.println(""+ls);
    }
}
