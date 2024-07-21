package recursions;

import java.util.Scanner;

public class Fibonnaci {
	static void printt(int n,int b,int c) {
		int ex;
		if (n<1) {
			return;
		}
		System.out.print(c+" ");
		ex=c;
		c=c+b;
		b=ex;
		printt(n-1,b,c);
		
	}
	public static void main(String[] args) {
		System.out.print("Input = ");
		Scanner myobj= new Scanner(System.in);
		int n= myobj.nextInt();
		System.out.print("0 ");
		printt(n,0,1);
	}
}
