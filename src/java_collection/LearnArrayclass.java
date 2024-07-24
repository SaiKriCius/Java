package java_collection;
import java.util.Arrays;

public class LearnArrayclass {
		public static void main(String[] args) {
			int[] numbr= { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
			
			int index = Arrays.binarySearch(numbr, 15); 
			
			System.out.println("The index of 15 is = "+index);
	
			Arrays.sort(numbr);
			
			for (int i : numbr) {
				System.out.print(i+" ");
			}
			
			//changes all the values inside the array to n
			//Arrays.fill(numbr,n);
			
			
			
			
		}
}
