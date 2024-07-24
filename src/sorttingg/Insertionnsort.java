package sorttingg;

public class Insertionnsort {
	static void insertionssort(int[] arr,int n) {
		for (int i = 1; i <n; i++) {
			for (int j = i; j >0 ; j--) {
				if (arr[j]<arr[j-1]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
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
		insertionssort(arr,n);
		
	
	}
		
}
