package sorttingg;

public class Quicksortt {

	static int partitionindex(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		while (i < j) {
			while (pivot >= arr[i] && i < high) {
				i++;
			}
			while (pivot < arr[j] ) {
				j--;
			}
			if (i < j) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}

		}
		 int temp = arr[low];
	        arr[low] = arr[j];
	        arr[j] = temp;
	        return j;

	}

	static void quicksort(int[] arr, int low, int high) {
		if (low < high) {
			int p = partitionindex(arr, low, high);
			quicksort(arr, low, p - 1);
			quicksort(arr, p + 1, high);

		}
	}

	public static void main(String[] args) {

		int n = 6;
		int[] arr = { 25, 47, 3, 92, 58, 17 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		quicksort(arr, 0, n - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}
