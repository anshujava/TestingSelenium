package practice;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println(openFile());
//		System.out.println(nullPointer());

	}
	public static String nullPointer(){
		 try {
		String[] x = null;

		for(int i=0; i<x.length; i++)
		{
       System.out.println(" "+x[i]);
		} 
		System.out.println("completed");
		
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
//			throw e;
			
        }
        finally {
//        	System.out.println("finally");
        	return "final";
        }
	}
	
	
	@SuppressWarnings("finally")
	public static String openFile(){
		 String s1 = " i ";
     	 String s2 = " am ";
     	 String s3 = " boy ";
	        try {
	        	
	        	System.out.println("try");
	        	return s1; 
	           
	        } catch (Exception e) {
	        	System.out.println("catch");
	        	return s2; 
	        }
	        finally {
	        	System.out.println("finally");
	            return s3;
	        }
	    }
}
