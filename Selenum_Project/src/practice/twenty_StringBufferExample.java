package practice;

public class StringBufferExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str =null;
//		System.out.println(str);
		StringBuffer sb = new StringBuffer();
//		sb.append(str).append(null);  /* not possible */
		sb.append(str).append("null");
        System.out.println(""+sb);
		
        
      
	}

}
