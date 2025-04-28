package implementationOfLists.searchImplementation;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 11;
        BinarySearchRecursion binary = new BinarySearchRecursion();
        int index = binary.binarySearch(arr, 0, arr.length-1, target);
        if(index==-1)
        	System.out.println("Not found");
        else
        	System.out.println("Founded at index "+index);
	}
	public int binarySearch(int arr[], int left, int right, int target) {
		if(left>right)
			return -1;
		int mid = left + (right-left)/2;
		if(arr[mid]==target)
			return mid;
		else if(target > arr[mid]) {
			return binarySearch(arr, mid+1, right, target);
		}
		else {
			return binarySearch(arr, left, mid-1, target);
		}
	}
}
