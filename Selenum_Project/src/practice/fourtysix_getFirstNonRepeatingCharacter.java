package practice;

public class fourtysix_getFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		String word ="entertainment";
		System.out.println(getFirstNonRepeatingCharacterHere(word));
	}
		
	public static Character getFirstNonRepeatingCharacterHere(String string) {
//		        if(string == null || string.length() == 0) {
//		            return null;
//		        }
		        
		        int n = string.length();
		        for(int i = 0; i < n; i++) {
		            boolean flag = true;
		            for(int j = 0; j < n; j++) {
		                if(i != j && string.charAt(i) == string.charAt(j)) {
		                    flag = false;
	                    break;
		                }
	            }
	            if(flag) {
	                return string.charAt(i);
	            }
	        }
	        return null;
		    }
		    

	}
