package medium_arrray;

public class Alternate_positive_negative {

public static int[] rearrangeArray2(int[] nums) {
    
	
	int[] answer = new int[nums.length];
	int even=0;
	int odd=1;
	
	
	for (int i = 0; i < answer.length; i++) {
		if (nums[i]>0) {
			answer[even]=nums[i];
			even+=2;
		}
		else {
			answer[odd]=nums[i];
			odd+=2;
		}
	}
	return answer;	
}

	public static void main(String[] args) {
		int[] nums = {3,1,-2,-5,2,-4};
		
	int[] result =	rearrangeArray2(nums);
		
	for(int i:result) {
		System.out.println(i);
	}
		
		
	}
}
