package medium_arrray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Majority_element {
static int majorityElement(int[] nums) {
		
	Map<Integer, Integer> mpp = new HashMap<>();
	
	for (int i = 0; i < nums.length; i++) {

		mpp.put(nums[i],mpp.getOrDefault(nums[i], 0) + 1);
	}
	 Integer maxKey = null;
     Integer maxValue = Integer.MIN_VALUE;
	
	Set<Map.Entry<Integer,Integer>> entryset = mpp.entrySet();
	Object[] entries = entryset.toArray();
	
	for (int i = 0; i < entries.length; i++) {
		
		@SuppressWarnings("unchecked")
		Map.Entry<Integer,Integer> entry = (Map.Entry<Integer,Integer>) entries[i];
		if (entry.getValue()>maxValue) {
			maxValue = entry.getValue();
			maxKey = entry.getKey();
		}
		
	}
	
	return maxKey;
	
	
    }
static int majorityElement2(int[] nums) {
	
	Map<Integer, Integer> mpp = new HashMap<>();
	
	for (int i = 0; i < nums.length; i++) {
		
		mpp.put(nums[i],mpp.getOrDefault(nums[i], 0) + 1);
	}
	Integer maxKey = null;
	Integer maxValue = Integer.MIN_VALUE;
	
	for(Map.Entry<Integer,Integer> entry : mpp.entrySet()) {
		if (entry.getValue()>maxValue) {
			maxValue = entry.getValue();
			maxKey = entry.getKey();
		}
	}
	
	return maxKey;
	
	
}
}
