package basic_maths;
import java.util.Scanner;
public class Prime_num {
	static void prime(int a) {
		int count=0;
		
		for (int i = 1; i <=a; i++) {
			if (a%i==0) {
				count++;
			}
		}
		
		if (count<=2) {
			System.out.print(a+" is a prime number");
		} else {
			System.out.print(a+" is not a prime number");
		}
		
	}

	public static void main(String[] args) {
			System.out.print("Input = ");
			Scanner myobj = new Scanner(System.in);
			int a=myobj.nextInt();
			prime(a);
	}

}
