package practice;

public class MethodOVerriding {
	/*
	superclass method is declared public then the overridding 
	method in the sub class cannot be either private or protected. */
	public static void main(String args[]){  
		MethodOVerriding obj = new Bike2();  
		obj.run();  
		}  
	
	    public void run(){
		System.out.println("Vehicle is running");
		}  
	}  
	class Bike2 extends MethodOVerriding{  
	    public void run(){
		System.out.println("Bike is running safely");
		}  
	  
	}
