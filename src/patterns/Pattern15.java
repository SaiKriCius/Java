package patterns;

import java.util.Scanner;

public class Pattern15 {
	static void pattern(int a) {
		for (int i = 0; i < a; i++) {
			for (char j ='A' ; j <'A'+a-i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Input = ");
		@SuppressWarnings("resource")
		Scanner myobj = new Scanner(System.in);
		int a = myobj.nextInt();
		pattern(a);

	}
}
