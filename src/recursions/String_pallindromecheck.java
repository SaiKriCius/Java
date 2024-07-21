package recursions;

import java.util.Scanner;

public class String_pallindromecheck {
	static void printt(int i,int sum) {
		if (i<1) {
			System.out.println(sum);
			return;
		}
		printt(i-1,sum+i);
	}
	public static void main(String[] args) {
		System.out.print("Input = ");
		Scanner myobj= new Scanner(System.in);
		int n= myobj.nextInt();
		printt(n,0);
	}
}
