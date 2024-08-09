package medium_arrray;

import java.util.ArrayList;
import java.util.List;

public class Maxscorefromsubarray {
	static int pairWithMaxSum(List<Integer> arr) {
		int sum = 0;
		for (int i = 0; i < (arr.size()-1); i++) {
			
			int currentsum= arr.get(i)+arr.get(i+1);
			
			if (currentsum>sum) {
				sum = currentsum;
			}
		}
		return sum;

	}

	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<>(List.of(857,376, 986,970,859 ,785));

		int a = pairWithMaxSum(arr);
		System.out.println(a);
	}
}
