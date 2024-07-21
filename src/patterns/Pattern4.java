package patterns;

import java.util.Scanner;

public class Pattern4 {

	static void pattern(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i);
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
