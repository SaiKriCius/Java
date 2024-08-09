package easy_array;


public class Consecutive_ones {
static int findMaxConsecutiveOnes(int[] nums) {
      
	int count = 0;
	int previouscount = 0;
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i]==1) {
				count ++;
				if (count >previouscount) {
					previouscount = count;
				}
			}
			else {
				count =0;
			}
			
		}
	
		return previouscount;
	
    }
	
	
}
