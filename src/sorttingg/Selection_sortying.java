package sorttingg;

public class Selection_sortying {
	static void slectionsort(int[] arr,int n) {
		for (int i = 0; i < n-1; i++) {
			int minimunn=i;
			for (int j = i+1; j < n; j++) {
				if (arr[j]<arr[minimunn]) {
					minimunn=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[minimunn];
			arr[minimunn] = temp;
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
		slectionsort(arr,n);
		
	
	}
}
