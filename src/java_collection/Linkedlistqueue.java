package java_collection;
import java.util.Queue;
import java.util.LinkedList;

public class Linkedlistqueue {
		public static void main(String[] args) {
			
			// we can create a queue like this and it can be implement by linkedlist, arraylist, priority queue
			//Queue is FIRST IN FIRST OUT 
			Queue<Integer> qyu = new LinkedList<>();
			
			//we can also use qyu.add()to enter values in the queue but if it fails then it will crash
			//so if you want it to show crash then use add() otherwise use offer()
			//offer()  return false if it fails
			//we can enter values in the queue using this
			qyu.offer(5);
			qyu.offer(9);
			qyu.offer(2);
			qyu.offer(6);
			qyu.offer(8);
			qyu.offer(3);
			
			//printing the queue
			System.out.println(qyu);
			
			
			//alternative for poll() is remove() and does the same thing as add() if queue is empty
			//poll() returns null if queue is empty
			//we can use the to remove the values from the queue and it will remove the first entered value in the queue
			qyu.poll();
			
			//we can also use this to print the element removed from the queue
			//System.out.println(qyu.poll());
			
			System.out.println(qyu);
			
			//alternative for peek() is element() and does the same thing as add() if queue is empty
			//peek() returns null if queue is empty
			//we can use the to show what element will be the next one to get removed if we use poll
			System.out.println(qyu.peek());
			
			
			
			
			
		}
}
