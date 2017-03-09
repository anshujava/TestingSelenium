package practice;

public class sumClosetToZero {
	public static void main(String[] args) 
    {
		int[] a = { 1, 5, 7, 3,2, 4 };
        int  min1 = 0, min2 = 1, minimum;
        int n = a.length;
        int sum =0;
        minimum=Math.abs(a[0] + a[1]);
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                sum = Math.abs(a[i] + a[j]);
                if(sum < minimum)
                {
                    min1 = i;
                    min2 = j;
                    minimum = sum;
                }
            }
        }
        System.out.println("Element 1:"+a[min1]); 
        System.out.println("Element 2:"+a[min2]);
    }
}