package easy_array;

import java.util.HashMap;
import java.util.Map;

public class K_sum_subarray {
	static int lenOfLongSubarr(int A[], int N, int K) {

		Map<Integer, Integer> mpp = new HashMap<>();
		int sum = 0;
		int maxlen = 0;

		for (int i = 0; i < N; i++) {

			sum = sum + A[i];

			if (sum == K) {
				maxlen = i + 1;
			}

			if (!mpp.containsKey(sum)) {
				mpp.put(sum, i);
			}
			if (mpp.containsKey(sum - K)) {

				if (maxlen < (i - mpp.get(sum - K))) {
					maxlen = i - mpp.get(sum - K);
				}
			}

		}
		return maxlen;
	}
}
