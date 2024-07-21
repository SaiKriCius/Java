package patterns;

import java.util.Scanner;

public class Pattern11 {
	static void pattern(int a) {
		int start;
		for (int i = 0; i < a; i++) {
			if (i%2==0) {
				 start=1;
			} else {
				start=0;
			}
			for (int j = 0; j <=i; j++) {
					System.out.print(start);
					start=1-start;
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
