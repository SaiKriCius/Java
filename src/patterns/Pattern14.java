package patterns;

import java.util.Scanner;

public class Pattern14 {
	static void pattern(int a) {
		for (int i = 0; i < a; i++) {
			for (char j = 'A'; j <='A'+i; j++) {
				System.out.print(j+" ");
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
