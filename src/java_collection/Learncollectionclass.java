package java_collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Learncollectionclass {
		public static void main(String[] args) {
	        List<Integer> list = new ArrayList<>();
	        list.add(34);
	        list.add(12);
	        list.add(9);
	        list.add(9);
	        list.add(76);
	        list.add(29);
	        list.add(75);
	        
	        System.out.println("min element is "+ Collections.min(list));
	        System.out.println("max element is "+ Collections.max(list));
	        System.out.println("frequency of 9 is "+ Collections.frequency(list,9));
	        
	        System.out.println("before sorting = "+list);
	        
	        Collections.sort(list);
	        System.out.println("after sorting = "+ list);
	        
	        Collections.sort(list, Comparator.reverseOrder());
	        System.out.println("after sorting in descending order = "+list);
	      
	        System.out.println();
	        
	        List<Student> stinfo = new ArrayList<>(); 
			
			stinfo.add(new Student("raj",2));
			stinfo.add(new Student("arun",5));
			stinfo.add(new Student("varun",3));
			stinfo.add(new Student("tarun",8));
			stinfo.add(new Student("nakul",1));
			
			System.out.println("before sorting =" + stinfo);
			
			//this is used to sort according to the rollno
			Collections.sort(stinfo);
			System.out.println("rollno wise = "+stinfo);
			
			//this is used to sort according to the name
			Collections.sort(stinfo,new Comparator<Student>() {
				@Override
				public int compare(Student o1,Student o2) { 
					return o1.name.compareTo(o2.name);
				}
			});
	        //after sorting based on the names
			System.out.println("name wise = "+stinfo);
	        
			//we can also sort according to names by using this 
			//this is called lambda idk why
			Collections.sort(stinfo,(o1, o2) -> o1.name.compareTo(o2.name));
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
		}
}
