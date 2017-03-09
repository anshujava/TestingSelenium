package practice;

public class ten_MethodOVerriding {
	/*super class		 	child class
	 ------------		    -------------
	 public					[should be public]
	 private				should not private......[public & protected]
	 protected				[public & protected]
	 default				[public & protected]
	 * 
	 * 
	 * */
	public static void main(String args[]){  
		Bike2 obj = new Bike2();  
		obj.run(10);
		obj.run("six");
		}  
	
	    public void run(String c){
		System.out.println("Vehicle is running");
		}  
	}  
	class Bike2 extends ten_MethodOVerriding{  
		public void run(int v){
		System.out.println("Bike is running safely");
		}  
	  
	}
