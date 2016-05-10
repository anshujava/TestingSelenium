package practice;

public class MatchUP {

	public int matchUp(int[] nums1, int[] nums2) {
		  int count =0;
		  for (int i =0; i <nums1.length ;i++)
	 
		  if (Math.abs(nums1[i] - nums2[i]) == 1 ||
		               Math.abs(nums1[i] -nums2[i]) == 2 )
		  count++;
		  System.out.println("count::"+count);
		  return count;
		}
	public static void main(String[] args)
	   {
		MatchUP mup = new MatchUP();
		int[] a = new int[]{1,2,3};
		int[] b = new int[]{2,3,10};
		mup.matchUp(a,b);	   }

}
