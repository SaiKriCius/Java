package medium_arrray;

import java.util.ArrayList;
import java.util.Collections;

public class Array_leaders {
	static ArrayList<Integer> leaders(int n, int arr[]) {

		ArrayList<Integer> answer = new ArrayList<>();
		int check = arr[n - 1];

		for (int i = (n - 1); i >= 0; i--) {

			if (arr[i] >= check) {
				check = arr[i];
				answer.add(check);

			}

		}
		Collections.reverse(answer);
		return answer;

	}

	public static void main(String[] args) {

		int[] arr = { 16, 17, 4, 3, 5, 2 };
		int n = arr.length;
		System.out.println(leaders(n, arr));

	}

}
