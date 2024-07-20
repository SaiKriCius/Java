package myfirstprogram;

import java.util.Scanner;

public class Pattern7 {
	static void pattern(int a) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <a-i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <2*i+1; j++) {
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		
		System.out.print("Input = ");
		Scanner myobj = new Scanner(System.in);
		int a = myobj.nextInt();
		pattern(a);
	}
}
