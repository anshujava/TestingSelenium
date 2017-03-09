package practice;

public class Factorial {

	public static void main(String args[]){  
		 //System.out.println("Factorial is: "+findfactorial(5)); 
		 System.out.println("Factorial is: "+factorial(3)); 
		 }  
	public static int factorial(int number){       
        //base case
        if(number == 0){
            return 1;
        }
        return number*factorial(number -1); //is this tail-recursion?
    }
	public static int findfactorial(int number){       
		int i,fact=1;  
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		 
		return fact;  
		}  
}