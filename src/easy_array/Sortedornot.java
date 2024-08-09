package easy_array;

public class Sortedornot {
	 static boolean check(int[] nums) {
		 int a =0;
		 int n= nums.length;
		 for (int i = 0; i < n-1; i++) {
			if (nums[i]>nums[i+1]) {
				a++;
				if(a>1) {
					return false;
				}
			}
		}
		 if(a==0) {
			 return true;
		 }
		 
		return nums[n-1] <= nums[0];
	    }
	 public static void main(String[] args) {
		 int[] nums = {7,8,9,1,2,3,4,5};
		 
		 System.out.println(check(nums));
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
