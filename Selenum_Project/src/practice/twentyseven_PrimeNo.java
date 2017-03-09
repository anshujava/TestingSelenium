package practice;

public class twentyseven_PrimeNo {
//Prime number in Java: 
//	Prime number is a number that is greater than 1 and divided by 1 or itself. 
//	In other words, prime numbers can't be divided by other numbers than itself or 1. 
//	For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
	 public static void main(String args[]){  
		  int i,m=0,flag=0;    
		  int n=11;//it is the number to be checked  
		  m=n/2;    
		  for(i=2;i<=m;i++){    
		   if(n%i==0){    
		   System.out.println("Number is not prime");    
		   flag=1;    
		   break;    
		   }    
		  }    
		  if(flag==0)    
		  System.out.println("Number is prime");    
		}  
		}  