package java_collection;
import java.util.PriorityQueue;

public class LearnPriorityqueue {
		public static void main(String[] args) {
			
			//for the smallest first we can use this 
			PriorityQueue<Integer> qyu = new PriorityQueue<>();
			
			//for the max value first we can use this 
			//this will make the largest value in the queue to be at the start of the queue
			//PriorityQueue<Integer> qyu = new PriorityQueue<>(Comparator.reverseOrder());
			
			
			
			//adding elements is same as queue
			qyu.offer(5);
			qyu.offer(9);
			qyu.offer(2);
			qyu.offer(6);
			qyu.offer(8);
			qyu.offer(3);
			
			//it prints the elements with the smallest one first cause of heap tree like structure 
			System.out.println(qyu);
			
			//it removes the smallest element in the queue not the first element we entered 
			//and then the next smallest element takes it's place
			qyu.poll();
			
			System.out.println(qyu);
			
			//we can use this to print the smallest value in the queue 
			//this is also the value that will be removed if we use poll()
			System.out.println(qyu.peek());
			
			
		}
}
