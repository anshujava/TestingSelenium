package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HappyNumber {
//	Example #1: 13 ; 12 + 32 = 1 + 9 =10 ; 12+ 02= 1 (Thus a happy number)
//	Example #2: 32; 3 2 + 2 2 = 9 + 4 = 13; and in Example#1 13 is already a happy number;
//	Some of the first happy numbers are: 1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100, 103, 109, 129, 130.
	
public static void main(String args[])throws Exception
	{
	int i,j;
	HappyNumber obj=new HappyNumber();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("enter a number : ");
	i=Integer.parseInt(br.readLine());
	while((j=obj.happy(i))/10!=0)       //   You have to check the sum of all digits until a single digit is achieved i.e. sum=1,2,3,..9
	{
	i=j;				// If sum of digits= 19 it then again goes to 1+9 =10 and again 1+0= '1' a single digit to check if 1 or not
	}
	if ( j==1)
	System.out.println("It is a happy number ");
	else
	System.out.println("Not a happy number");
	}
	 
	int happy(int n)
	{
	if(n/10==0)
	return n*n;
	else
	return (int)Math.pow(n%10,2)+ happy(n/10);
	}
	}

