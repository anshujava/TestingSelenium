package practice;

public class EvenOddWithoutOperator {
/*
 * Bitwise Operators :
Bit wise operators will work on bits at a time.
AND : 1 & 1=1
OR :     0 | 1= 1 , 1 | 0=1 , 1| 1= 1
XOR:   0 ^ 1= 1 , 1^ 0=1
NOT : !0=1
Take two number 2 and 3
010 : 2
011 : 3
------
010 : 2
------
Take two numbers 2 and 1
010  :2
001  :1
-----
000  :0
-----
From above example we can say that on every even number & 1 gives 0.
So this is our logic to be implemented in our program  if "Number & 1==0" then its even number.
 */
	public static void main(String[] args) {
		int number =9;
   		if((number & 1) == 0){ 
   			System.out.println("Even number");
   			}else{
   				System.out.println("Odd number");
   			}


	}

}
