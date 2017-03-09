package practice;

 class eighteen_MultipleInheritance {
	public void methodX()
	   {
	     System.out.println("Class X method");
	   }
	}
	class Y extends eighteen_MultipleInheritance
	{
	public void methodY()
	{
	System.out.println("class Y method");
	}
	} //Single Inheritance
	class Z extends Y
	{
	   public void methodZ()
	   {
	     System.out.println("class Z method");
	   }
	   public static void main(String args[])
	   {
	     Z obj = new Z();
	     obj.methodX(); //calling grand parent class method
	     obj.methodY(); //calling parent class method
	     obj.methodZ(); //calling local method
	  }//multi level
	}
