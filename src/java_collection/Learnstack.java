package java_collection;
import java.util.Stack;
public class Learnstack {
	public static void main(String[] args) {
		
		//creating a stack: Last IN First OUT
		Stack<String> animal= new Stack<>();
		
		//adding values to the stack using this
		animal.push("Lion");
		animal.push("Dog");
		animal.push("Cat");
		animal.push("Horse");
		animal.push("Tiger");
		animal.push("Whale");
		
		//printing the stack
		System.out.println(animal);
		
		//we can use this to check the last entered element in the stack 
		// or we can call it the top most element in the stack
		System.out.println(animal.peek());
		
		//we can use this to delete the last entered element in the stack
		animal.pop();
		System.out.println(animal);
		System.out.println(animal.peek());
		
	}
}
