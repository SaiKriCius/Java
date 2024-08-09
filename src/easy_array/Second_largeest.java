package easy_array;
import java.util.List;
import java.util.ArrayList;
public class Second_largeest {
	static int print2largest(List<Integer> arr) {
		if (arr.size()<2) {
			return -1;
		}
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
			int value = arr.get(i);
			
			if (value>first) {
				second = first;
				first = value;
			}
			else if (value>second && value !=first) {
				second = value;
			}
        }
       
        if (second <0) {
			return -1;
		}
        else {
        	return second;
        }
        
        
    }
	public static void main(String[] args) {
		
		 List<Integer> arr = new ArrayList<>();
	        arr.add(42);
	        arr.add(17);
	        arr.add(58);
	        arr.add(23);
	        arr.add(91);
	        arr.add(91);
	        
	        System.out.println(print2largest(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
