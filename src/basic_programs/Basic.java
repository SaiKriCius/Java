package basic_programs;

import java.util.ArrayList;
import java.util.List;

public class Basic {
	public static void findSubsets(List<Integer> nums, int target, int start, List<Integer> path,
			List<List<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<>(path));
			return;
		}
		for (int i = start; i < nums.size(); ++i) {
			if (nums.get(i) > target)
				continue;
			path.add(nums.get(i));
			findSubsets(nums, target - nums.get(i), i + 1, path, result);
			path.remove(path.size() - 1);
		}
	}

	public static List<List<Integer>> findSubsetsThatSumToTarget(List<Integer> nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		findSubsets(nums, target, 0, new ArrayList<>(), result);
		return result;
	}

	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 2, 4, 5, 7, 9, 10);
		int target = 15;
		List<List<Integer>> result = findSubsetsThatSumToTarget(nums, target);

		System.out.println("Subsets that sum to " + target + ":");
		for (List<Integer> subset : result) {
			System.out.println(subset);
		}
	}
}
