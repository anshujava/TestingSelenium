package practice;

public class fourtyfive_NativeStatic {
	public native void printText ();
	
	fourtyfive_NativeStatic() {
       System.out.println("in constructor");
}
	static
	   {
	   System.out.println("in static");
	   }
	public static void main(String[] args) {
		fourtyfive_NativeStatic ns = new fourtyfive_NativeStatic();
		 System.out.println("in main");
		

	}

}
