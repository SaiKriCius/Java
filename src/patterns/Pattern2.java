package patterns;

import java.util.Scanner;

public class Pattern2 {
		
	static void pattern(int a) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <=i; j++) {
				
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
