package practice;

public class thirtynine_StrigngFormat {

	public static void main(String[] args) {
		String s = "anshuman choudhury";
		String s1 ="biju patnaik";
		thirtynine_StrigngFormat st = new thirtynine_StrigngFormat();
		st.StringFormat(s);
	}
	public void  StringFormat(String str){
		//first way
//		char st=str.charAt(0);
//		String lastWord = str.substring(str.lastIndexOf(" ")+1);
//		System.out.println(str.lastIndexOf(" "));
//		System.out.println(st+" "+lastWord);
		//2nd way
		String arr[]= str.split(" ");
		System.out.println(arr[0].charAt(0));
		System.out.println(arr[1]);
		
	}

}
