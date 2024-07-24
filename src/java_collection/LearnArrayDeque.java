package java_collection;
import java.util.ArrayDeque;

public class LearnArrayDeque {
		
		public static void main(String[] args) {
			
		//In ArrayDeque we can add values at the start and at the end as well and can fetch or traverse them from both sides
		ArrayDeque<Integer> arr = new ArrayDeque<>();
		
		//we can add elements using this
		arr.offer(5);
		arr.offer(9);
		arr.offer(2);
		arr.offer(6);

		System.out.println(arr);
		
		//we can add elements at the start of the array using this
		arr.offerFirst(7);
		
		//we can add elements at the end of the array using this
		arr.offerLast(9);
		
		System.out.println(arr);
		
		//to check the first element in the array
		System.out.println(arr.peek());
		
		//to check the first element in the array
        System.out.println(arr.peekFirst());
        
        //to check the last element in the array
        System.out.println(arr.peekLast());
        System.out.println(arr);

        System.out.println();
        
        //we can use this to remove the element at the start of the array
        System.out.println(arr.poll());
        System.out.println("poll() " +arr);

        //we can use this to remove the element at the start of the array
        System.out.println(arr.pollFirst());
        System.out.println("pollFirst() " +arr);

        //we can use this to remove the element at the end of the array
        System.out.println(arr.pollLast());
        System.out.println("pollLast() " +arr);
		
		}
}
