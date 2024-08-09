package easy_array;

public class Find_missing {
	static int missingNumber(int[] nums) {

		int xor = nums.length;
		for (int i = 0; i < nums.length; i++) {
			xor = xor ^ i;
			xor = xor ^ nums[i];
		}
		return xor;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		;

		int n = 100000000;
		int missingElement = 19;
		int[] nums = new int[n]; // Array size of 100000

		int index = 0;
		for (int i = 0; i <= n; i++) {
			if (i != missingElement) {
				nums[index++] = i;
			}
		}

		System.out.println(missingNumber(nums));
		long end = System.currentTimeMillis();
		;

		System.out.println((end - start) + " ms");

	}
}
