package medium_arrray;

import java.util.HashMap;
import java.util.Map;

public class Two_sum {
	static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> mpp = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {

			int complement = target - nums[i];
			if (mpp.containsKey(complement)) {
				return new int[] { i, mpp.get(complement) };
			}
			mpp.put(nums[i], i);

		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] result = twoSum(nums, target);
		// Print the result array
		System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");

	}
}
