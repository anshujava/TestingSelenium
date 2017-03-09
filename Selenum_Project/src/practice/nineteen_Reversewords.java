package practice;

public class Reversewords {
	public static void main(String[] args) {
		   
        // Test String

        String str = "Hello Good Morning";
      

        // Split based on space. Words are seperated by Spaces only.

        String[] arr = str.split(" ");
       

        // the below for loop is for reversing the string array.

        for(int i = arr.length-1; i >= 0 ; i--) {

            System.out.print(arr[i] + " ");

        }
    }
}
