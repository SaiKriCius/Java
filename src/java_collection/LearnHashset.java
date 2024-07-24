package java_collection;

import java.util.HashSet;
import java.util.Set;


public class LearnHashset {
	public static void main(String[] args) {
		
		//we can create a set like this and Set doesn't store duplicate values
		//sequence of elements in set is random	
		Set<Integer> set = new HashSet<>();

		//we can use LinkedHasSet to get the have the elements to be in the order we put them in
		//all other properties are same as the HashSet
		//Set<Integer> set = new LinkedHashSet<>();
		
		//we can use TreeSet to automatically sort the elements that we put in the set
		//all other properties are same as the HashSet
		//Set<Integer> set = new TreeSet<>();
		
		
		
		//we can add elements in the set like this 
		set.add(5);
		set.add(1);
		set.add(9);
		set.add(4);
		set.add(2);
		set.add(7);
		
		//the elements in the set are stored in kinda random order 
		//so 5 can be or cannot be at the start we don't know until we print the set
		System.out.println(set);

		//we can remove the element by it's value in the set
		set.remove(1);
		System.out.println(set);

		//we can use .contains(n) to checking if n is inside the set or not
		System.out.println(set.contains(9));
		
		//we can use this to check if the set is empty
		System.out.println(set.isEmpty());
		
		//prints the size of the set
		System.out.println(set.size());
		
		//clears the whole set
//		set.clear();
		
		
		
	}
}
