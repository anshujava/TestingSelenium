package practice;

import java.util.Scanner;

public class StringSimilarity {

//	public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        long res;
//
//        int _t_cases = Integer.parseInt(in.nextLine());
//        for (int _t_i = 0; _t_i<_t_cases; _t_i++) {
//            String _a = in.nextLine();
//            res = stringSimilarity(_a);
//            System.out.println(res);
//        }
//    }
//	static long stringSimilarity(String a) {
//	    char[]arr=a.toCharArray();
//			int length=arr.length;
//			int count=length;
//	        for(int i=1;i<length;i++){
//	            int len=length-i;
//	            int j=0;
//	            for(;j<len;j++)
//	                if(arr[j]!=arr[j+i]){
//						break;
//					}
//				count+=j;
//	            
//	        }
//
//	        return count;
//	    }
/*
 * 
2
ababaa
aa
 */
	public static void main(String[] args) {
		
		

	        Scanner user_input = new Scanner(System.in);

	        String v1 = user_input.next();
	        int number_cases = Integer.parseInt(v1);

	        String[] cases = new String[number_cases];
	        for(int i=0;i<number_cases;i++)
	            cases[i] = user_input.next();

	        for(int k=0;k<number_cases;k++){
	            int similarity = solve(cases[k]);   
	            System.out.println(similarity);
	        }
	    }

	    static int solve(String sample){

	        int len=sample.length();
	        int sim=0;
	        for(int i=0;i<len;i++){
	            for(int j=i;j<len;j++){
	                if(sample.charAt(j-i)==sample.charAt(j))
	                    sim++;
	                else
	                    break;
	            }
	        }
	        return sim;
	    }
	}
