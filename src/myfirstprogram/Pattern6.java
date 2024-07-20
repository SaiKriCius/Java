package myfirstprogram;

import java.util.Scanner;

public class Pattern6 {
	static void pattern(int a) {
		for (int i = 0; i < a; i++) {
			for (int j = 1; j <=a-i; j++) {
				System.out.print(j);
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
