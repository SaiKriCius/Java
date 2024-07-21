package recursions;

import java.util.Scanner;

public class Reverse_array {
	static void printt(int a,int n,int[] arr) {
		if (a<n) {
			
			int b=arr[a];
			arr[a]=arr[n];
			arr[n]=b;
			
			printt(a+1,n-1,arr);
		}
	}
	static void printarr(int n,int[] arr) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		System.out.print("Input = ");
		Scanner myobj= new Scanner(System.in);
		int n= myobj.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i <n; i++) {
			arr[i]=i+1;
		}
		printt(0,n-1,arr);
		printarr(n,arr);
	}
}
