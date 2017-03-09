package practice;

public class thirtyseven_ArithException  {
	public static void main(String args[]) 
	{
	 
	try{
		int i =6;
		int j=i/0;
		System.out.println(j);
		
	}
	catch(ArithmeticException aex){
		System.out.println(" arith exception is : "+aex.getMessage());
	}
	catch(Exception  ex){
		System.out.println("exception is : "+ex.getMessage());
	}
	
	 
	 }
	 
	
}
