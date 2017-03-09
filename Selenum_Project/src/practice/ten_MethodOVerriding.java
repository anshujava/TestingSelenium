package practice;

public class MethodOVerriding {
	/*
	superclass method is declared public then the overridding 
	method in the sub class cannot be either private or protected. */
	public static void main(String args[]){  
		Bike2 obj = new Bike2();  
		obj.run("5");
		}  
	
	    public void run(int c){
		System.out.println("Vehicle is running");
		}  
	}  
	class Bike2 extends MethodOVerriding{  
	    void run(String v){
		System.out.println("Bike is running safely");
		}  
	  
	}
