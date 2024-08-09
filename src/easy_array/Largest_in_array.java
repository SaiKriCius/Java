package easy_array;

public class Largest_in_array {
	
		static int largest(int n, int[] arr) {
	        for(int i=1;i<n;i++){
	            if(arr[i-1]>arr[i]){
	                int temp = arr[i-1];
	                arr[i-1] = arr[i];
	                arr[i]= temp;
	            }
	        }
	    
	        return arr[n-1];
	    }
		public static void main(String[] args) {
			int n=6;
			int[] arr = {25, 47, 3, 92, 58, 17};
			System.out.println(arr);
			System.out.println(largest(n,arr));
		}
	}


