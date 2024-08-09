package learn_hashing;

public class Highest_lowest_frequency {
	
	static void frequency(int [] nums, int n,int p) {
			
		
		int[] hash = new int[n+p];
			for (int i = 0; i < n; i++) {
				hash[nums[i]]++;
			}
			int lowfrequency= Integer.MAX_VALUE;
			int maxfrequency =0;
			int max = -1,low=-1;
			for (int i = 0; i < hash.length; i++) {
					
					if(hash[i]>maxfrequency) {
						maxfrequency =hash[i];
						 max=i;
					}
				if(hash[i]<lowfrequency && hash[i]!=0) {
					lowfrequency=hash[i];
					low = i;
				}
			}
			
			System.out.println(max + " comes "+maxfrequency +" times and "+low +" comes "+ lowfrequency +" times.");
		
		
	}
public static void main(String[] args) {
		
		int n = 20;
		int arr[] = {22, 15, 22, 30, 15, 8, 30, 7, 22, 15, 8, 30, 25, 22, 8, 7, 25, 30, 22, 7};
		int p = 21;
		
		frequency(arr,n,p);
    }
	
	
}
