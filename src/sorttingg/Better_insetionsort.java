package sorttingg;

public class Better_insetionsort {
	static void insertionssort(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int j = i;
			while (j > 0 && arr[j] < arr[j - 1]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				j--;

			}

		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int n = 6;
		int[] arr = { 25, 47, 3, 92, 58, 17 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		insertionssort(arr, n);

	}
}
