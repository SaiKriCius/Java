package patterns;

import java.util.Scanner;

public class Pattern18 {
	static void pattern(int a) {
		for (int i = 0; i < a; i++) {
			for (char j =(char)('A'+a-1-i); j <'A'+a; j++) {
				System.out.print(j);
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
