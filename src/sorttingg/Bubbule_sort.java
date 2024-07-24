package sorttingg;

public class Bubbule_sort {
	static void bulbulsort(int[] arr,int n) {

		for (int i = 0; i < n-1; i++) {
			int maximunn=n-i-1;
			
			for (int j = 0; j < n-i; j++) {
				if (arr[j]>arr[maximunn]) {
					maximunn=j;
				}
			}
			int temp = arr[n-i-1];
			arr[n-i-1]=arr[maximunn];
			arr[maximunn] = temp;
		}	
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		int n=6;
		int[] arr = {25, 47, 3, 92, 58, 17};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		bulbulsort(arr,n);
		
	
	}
}
