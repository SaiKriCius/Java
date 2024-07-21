package recursions;
import java.util.Scanner;
public class Print_times {
	static void printt(int i,int n) {
		if (i>n) {
			return;
		}
		System.out.println("hoooha");
		i++;
		printt(i,n);
	}
	public static void main(String[] args) {
		System.out.print("Input = ");
		Scanner myobj= new Scanner(System.in);
		int n= myobj.nextInt();
		printt(1,n);
	}
}
