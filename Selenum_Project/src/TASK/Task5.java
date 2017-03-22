package TASK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task5 {
/*
 *5. Write a decorator to cache function invocation results. 
 *Store pairs arg:result in a dictionary in an attribute of the function object. The function being memorized is:

def fibonacci(n): 
      assert n >= 0 
      if n < 2:
            return n 
      else: 
            return fibonacci(n-1) + fibonacci(n-2)



 */
    static Map<Integer, BigInteger> memo = new TreeMap<Integer, BigInteger>();
    public static void main (String[] args) throws IOException{
        BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
	System.out.println("Enter a number to calculate fibonacci value of that value:");
        int num = 0;
        int fibnum;
	num = Integer.parseInt(inKb.readLine());
	fibnum = fibonacci(num);
	System.out.println("the fibonacci value of " + num + "th is "+ fibnum);
        System.out.println ("The memoized calculation of that value is: " + memoizedFibonacci(num));
    }
    static int fibonacci(int n) {
	if (n <= 1) {
	    return 1;
           
	}	
	else {
	    return fibonacci(n-1) + fibonacci(n-2);
             
	}
    }
    static BigInteger memoizedFibonacci(int n)
	{
		if (n <= 1) return BigInteger.ONE;
		if (memo.get(n) == null)
                {
			
			memo.put(n, memoizedFibonacci(n-1).add(memoizedFibonacci(n-2)));
            }
		return memo.get(n); 
	}
}
