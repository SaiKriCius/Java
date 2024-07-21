package patterns;
import java.util.Scanner;
public class Pattern22 {
	static void pattern(int a) {
		for (int i = 0; i <2*a-1; i++) {
			for (int j = 0; j < 2*a-1; j++) {
				int top = i;
	            int left = j;
	            int right = 2*a-2-j;
	            int bottom = 2*a-2-i;
	            System.out.print(a - Math.min(Math.min(top,bottom),Math.min(left,right)));
	            
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
