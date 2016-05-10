package practice;

public class Conversion {
	public static void main(String[] args) {
		Conversion conv = new Conversion();
		String strHeloo = conv.intToString(7);
		int j = 6;
		System.out.println("output after int to String::"+(strHeloo+j));
		
		int d = conv.StringToint("6");
		int p = 12;
		System.out.println("output after String to int::"+(d+p));
	}
	
	public String intToString(int x){
		String str = "";
		str = String.valueOf(x);
		return str;
		
	}
	
	public int StringToint(String x){
		int i = 0;
		i = Integer.parseInt(x);
		return i;
		
	}
}
