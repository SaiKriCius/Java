package patterns;

import java.util.Scanner;

public class Pattern17 {
	static void pattern(int a) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a-i-1; j++) {
				System.out.print(" ");
			}
			for (char j = 'A'; j <='A'+i; j++) {
				System.out.print(j);
			}
			for (char j = (char)('A'+i); j>'A'; j--) {
				System.out.print((char)(j-1));
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
