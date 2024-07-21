package patterns;

import java.util.Scanner;

public class Pattern12 {
	static void pattern(int a) {
		int b=2*(a-1);
		for (int i = 1; i <=a; i++) {
			
			for (int j = 1; j <=i ; j++) {
				System.out.print(j);
			}
			for (int j = 0; j < b ; j++) {
				System.out.print(" ");
			}
			b-=2;
			for (int j =i ; j>0; j--) {
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
