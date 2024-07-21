package recursions;

import java.util.Scanner;

public class Nto1 {
	static void printt(int i,int n) {
		if (i<1) {
			return;
		}
		System.out.println(i);
		printt(i-1,n);
		
	}
	public static void main(String[] args) {
		System.out.print("Input = ");
		Scanner myobj= new Scanner(System.in);
		int n= myobj.nextInt();
		printt(n,n);
	}
}
