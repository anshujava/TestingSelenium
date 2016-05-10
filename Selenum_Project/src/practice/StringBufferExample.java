package practice;

public class StringBufferExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str ="Anshuman";
		StringBuffer sb = new StringBuffer();
//		sb.append(str).append(null);  /* not possible */
		sb.append(str).append("null");
//        System.out.println(""+sb);
        
        String str1 = null;
        System.out.println(str1);
	}

}
