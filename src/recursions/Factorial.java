package recursions;

import java.util.Scanner;

public class Factorial {
	static int printt(int n) {
		if (n==0) {
			return 1;
		}
		return n * printt(n-1);
	}
	public static void main(String[] args) {
		System.out.print("Input = ");
		Scanner myobj= new Scanner(System.in);
		int n= myobj.nextInt();
		System.out.print(printt(n));
	}
}
