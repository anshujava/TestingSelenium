package practice;

public class Constructor {
	public static void main(String args[]){  
		a2 b = new a2();
		
		b.Hello();
		}  
	public Constructor(){
		System.out.println("inside first constructor");
	}
	static {
        System.out.println("static block in first");
    }
	public void Hello(){
		System.out.println("in hello1");
	}
}
	class a2 extends Constructor{  
		
		public a2(){
			System.out.println("inside 2nd constructor");
		}
		static {
	        System.out.println("static block in 2nd");
	    }
		public void Hello(){
			System.out.println("in hello2");
		}
	
}
