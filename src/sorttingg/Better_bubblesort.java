package sorttingg;

public class Better_bubblesort {
	static void bulbulsort(int[] arr, int n) {

		for (int i = n - 1; i >= 0; i--) {

			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] > arr[j+1]) {

					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
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
		bulbulsort(arr, n);

	}
}
