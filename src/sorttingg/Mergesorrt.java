package sorttingg;

import java.util.ArrayList;

public class Mergesorrt {

	static void mergesortt(int[] arr,int low, int high) {
		
			if(high==low) {
				return;
			}
			int mid = (low+high)/2;
			mergesortt(arr,low,mid);
			mergesortt(arr,mid+1,high);
			merge(arr,low,mid,high);
	}
	static void merge(int[] arr, int low,int mid, int high) {
			
		ArrayList<Integer> temp = new ArrayList<>();
			int left = low;
			int right = mid+1;
		while(left<=mid && right<=high) {
					  if(arr[left]<=arr[right]) {
						temp.add(arr[left]);
						left++;
					}
					else {
						temp.add(arr[right]);
						right++;
					}
				}
		while(left<=mid) {
			temp.add(arr[left]);
			left++;
		}
		while(right<=high) {
			temp.add(arr[right]);
			right++;
		}
		for(int i= low;i<=high;i++) {
			arr[i]= temp.get(i-low);
		}
	}
	public static void main(String[] args) {
		
		int n=6;
		int[] arr = {25, 47, 3, 92, 58, 17};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		mergesortt(arr,0,n-1);
		for (int i : arr) {  
			System.out.print(i + " ");
		}
		System.out.println();
		
	}

}
