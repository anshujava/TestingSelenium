package practice;

public class SwapVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 SwapWithThirdVariable(10,20);
		 SwapWithoutThirdVariable(10,20);

	}
	
	public static void SwapWithThirdVariable(int x , int y){
		System.out.println("1st variable: "+x+":2nd variable :"+y);
		int z = x;
		x=y;
		y=z;
		System.out.println("after swap 1st variable: "+x+":2nd variable: "+y);
	}
	public static void SwapWithoutThirdVariable(int x , int y){
		System.out.println("1st variable: "+x+":2nd variable :"+y);
		x = x+y;
		y = x-y;
		x= x-y;

		System.out.println("after swap 1st variable: "+x+":2nd variable: "+y);
		
		
	}
}
