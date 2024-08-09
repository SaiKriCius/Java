package learn_hashing;


public class Frequency_of_elements {
	public static void complexfrequencyCount(int arr[], int N, int P)
    {
		P++;
		for (int i = 0; i < N; i++) {
			
			int index = (arr[i]%P)-1;
			
			if (index >=0 && index <N) {
				arr[index] = arr[index] + P;
			}
			
		}
		for (int i = 0; i < N; i++) {
			
			arr[i] = arr[i]/P;
		}
        
    }
	public static void frequencyCount(int arr[], int N, int P)
    {
        //pre computing
		int[] hash = new int[P+1];
		
		for (int i = 0; i < N; i++) {
			
			hash[arr[i]]++;
		}
		
		for (int i = 0; i < N; i++) {
			
			arr[i]=hash[i+1];
		}
    }
	
			
	public static void main(String[] args) {
		
		int n = 5;
		int arr[] = {2, 3, 2, 3, 6};
		int p = 6;
		
//		frequencyCount(arr,n,p);
//		
//		for (int i : arr) {
//			System.out.println(i);
//		}
		
		
		complexfrequencyCount(arr,n,p);
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		
		
	}
}
