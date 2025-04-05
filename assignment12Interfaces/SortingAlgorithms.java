package assignment12Interfaces;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

interface Sortable {
	void sort(int arr[]);

	static void display(int orgArr[], int arr[]) {
		System.out.println("Before Sorted");
		System.out.println(Arrays.toString(orgArr));
		System.out.println("After Sorted..");
		System.out.println(Arrays.toString(arr));
	};
}

class BubbleSort implements Sortable {

	@Override
	public void sort(int[] array) {
		int size = array.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}

class QuickSort implements Sortable {
	@Override
	public void sort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	public void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	public int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

}

class MergeSort implements Sortable {
	@Override
	public void sort(int[] arr) {
		mergeSort(arr, 0, arr.length - 1);
	}

	public void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;

			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);

			merge(arr, l, m, r);
		}
	}

	public void merge(int[] arr, int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}

public class SortingAlgorithms {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter array size: ");
			int size = scanner.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter input:");
			for (int i = 0; i < size; i++) {
				arr[i] = scanner.nextInt();
			}
			int cloneArr[] = arr.clone();
			Sortable sortable;
			while (true) {
				System.out.println("Choose Sorting Method");
				System.out.println("1. Bubble Sort");
				System.out.println("2. Quick Sort");
				System.out.println("3. Merge Sort");
				System.out.println("4. Exit");
				try {
					int opt = scanner.nextInt();
					switch (opt) {
					case 1:
						sortable = new BubbleSort();
						sortable.sort(arr);
						Sortable.display(cloneArr, arr);
						arr = cloneArr.clone();
						break;
					case 2:
						sortable = new QuickSort();
						sortable.sort(arr);
						Sortable.display(cloneArr, arr);
						arr = cloneArr.clone();
						break;
					case 3:
						sortable = new MergeSort();
						sortable.sort(arr);
						Sortable.display(cloneArr, arr);
						arr = cloneArr.clone();
						break;
					case 4:
						System.out.println("Bye..Byee...");
						return;
					default:
						System.out.println("Enter 1-4 only...");
					}
				} catch (InputMismatchException e) {
					System.out.println("Enter only 1 to 4...");
					scanner.nextLine();
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter proper input");
		}
	}

}
