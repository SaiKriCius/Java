package patterns;

import java.util.Scanner;

public class Pattern16 {
	static void pattern(int a) {
		
		for (int i = 0; i < a; i++) {

			for (int j = 0; j <=i; j++) {
				System.out.print((char) ('A'+i));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Input = ");
		Scanner myobj = new Scanner(System.in);
		int a = myobj.nextInt();
		pattern(a);

	}
}
