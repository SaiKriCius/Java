package easy_array;

import java.util.ArrayList;

public class UnionArray {
	public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
		ArrayList<Integer> union = new ArrayList<>();
		int start1 = 0;
		int start2 = 0;

		while (start1 < n && start2 < m) {
			if (arr1[start1] <= arr2[start2]) {
				if (union.isEmpty() || union.get(union.size() - 1) != arr1[start1]) {
					union.add(arr1[start1]);
				}
				start1++;
			} else {
				if (union.isEmpty() || union.get(union.size() - 1) != arr2[start2]) {
					union.add(arr2[start2]);
				}
				start2++;
			}
		}

		while (start1 < n) {
			if (union.isEmpty() || union.get(union.size() -1)!= arr1[start1]) {
				union.add(arr1[start1]);
			}
			start1++;
		}
		while (start2 < m) {
			if (union.isEmpty() || union.get(union.size() -1)!= arr2[start2]) {
				union.add(arr2[start2]);
			}
			start2++;
		}

		return union;

	}

	public static void main(String[] args) {
		int n = 4;
		int arr1[] = { 1, 2, 3, 4, 5 };
		int m = 4;
		int arr2[] = { 1, 2, 3, 6, 7 };

		System.out.println(findUnion(arr1, arr2, n, m));

	}

}
