package implementationOfLists.searchImplementation;

public class LinearSearchRecursion {
	public static void main(String[] args) {
		int arr[] = {90,24,2,13,53,11,9};
		int target = 40;
		LinearSearchRecursion linearSearchObj = new LinearSearchRecursion();
		int index = linearSearchObj.linearSearch(arr, target, 0);
		if(index == -1)
			System.out.println("Not Found");
		else
			System.out.println("Founded at index "+index);
	}
	public int linearSearch(int arr[], int target, int index) {
		if(index==arr.length)
			return -1;
		if(arr[index]==target)
			return index;
		return linearSearch(arr, target, index+1);
	}
}
