package patterns;

import java.util.Scanner;

public class Pattern10 {
	static void pattern(int a) {

		for (int i = 1; i <=2*a-1; i++) {
			
			int stars=i;
			if(i>a) {
				stars=2*a-i;
				
			}
			for (int j = 1; j <=stars; j++) {
				System.out.print("*");
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
