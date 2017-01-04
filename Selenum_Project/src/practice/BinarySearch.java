package practice;

public class BinarySearch {

	public static void main(String[] args) {
	int a[]= new int[]{20,30,10,25,45};	
		System.out.println(search(a,45));

	}
	public static int search(int ar[], int find) {
        int start = 0;
        int end = ar.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (ar[mid] == find) {
                return mid;
            } else if (ar[mid] < find) {
                start = mid + 1;
            } else if (ar[mid] > find) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
