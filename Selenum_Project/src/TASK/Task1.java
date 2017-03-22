package TASK;

/*1. Given two lists A and B. Find the sum of squares of elements in A and cubes of elements in B. 
Example: A = [1,2,3] and B=[2,3]. The sum would be 1^2 + 2^2 + 3^2 + 2^3 + 3^3. 
The challenge would be to accomplish this with the least lines of code possible. Best case is a single line solution.
*/
public class Task1 {

	public static void main(String[] args) {

        int [] A={1,2,3};
        int [] B={2,3};


       System.out.println("Total sum is = " + (SumOfA(A)+ SumOfB(B)));

	}
	public static int SumOfA(int[] A)
	{
	    int square=1;
	    int sum=0;   
	    int n=A.length; 

	    for(int i=0;i<n;i++)
	    {
	        square=A[i]*A[i];
	        sum+=square;
	    }
	    return sum;

	}
	public static int SumOfB(int[] B)
	{
	    int cube=1;
	    int sum=0;   
	    int n=B.length; 

	    for(int i=0;i<n;i++)
	    {
	        cube=B[i]*B[i]*B[i];
	        sum+=cube;
	    }
	    return sum;

	}
}
