package java_collection;
import java.util.Map;
import java.util.HashMap;

public class LearnMap {
		public static void main(String[] args) {
		
		//we can create a map like this
		//It can create a key and it's value here key is String and value is Integer
		//entered value will be placed in random because because it's hash mapping
		Map<String,Integer> nums = new HashMap<>();
		
		//we can create treemap like this 
		//Here the entered value will be sorted on the basis of the Key
		//Map<String,Integer> nums = new TreeMap<>();
		
		
		//we can enter values in it like this
		nums.put("one",1);
		nums.put("two",2);
		nums.put("three",3);
		nums.put("four",4);
		nums.put("five",5);
	
		System.out.println(nums);
		
		//removes the key and it's value
		nums.remove("four");
		
		//this will override the value of the key "two" 
		//you can't have multiple keys with same name but you can have the same values
		nums.put("two", 22);
		System.out.println(nums);
		
		//this will run when if there is no value at the key "two"
		nums.putIfAbsent("two", 23);
		
		//checks if there is any value in the map with this value
		System.out.println(nums.containsValue(3));
		
		//checks if map is empty or not
		System.out.println(nums.isEmpty());
		
		//clears the map
		// nums.clear();
		
		for (Map.Entry<String, Integer> i : nums.entrySet()) {
			
			//creating new variables and using them to print key and value
			String key = i.getKey();
			Integer val = i.getValue();
			System.out.println(key+" "+val);
			
			//directly printing key and value by using i.getkey()
			System.out.println(i.getKey());
			System.out.println(i.getValue());
			
			
		}
		System.out.println();
		
		for(Map.Entry<String,Integer> i:nums.entrySet()) {
			
			//directly printing key and value using the variable i we made
			System.out.println(i);
		}
		
		System.out.println();
		
		//for loop to print only the keys in the map set
		for(String i:nums.keySet()) {
			System.out.println(i);
		}
		
		System.out.println();

		//for loop to print only the values of the map set
		for(Integer i:nums.values()) {
			System.out.println(i);
		}
		
		
		
		
		
		
		}
}
