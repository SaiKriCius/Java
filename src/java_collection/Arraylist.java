package java_collection;
import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		
		ArrayList<String> studentname = new ArrayList<>();
		
		//we can add values to the arraylist using this
		studentname.add("raj");
		studentname.add("rajwe");
		studentname.add("rawej");
		studentname.add("raewj");
		studentname.add("rajsdf");
		studentname.add("rafsj");
		studentname.add("raweewewj");
		System.out.println(studentname);
		
		//we can remove any element by it's value using this
		studentname.remove(String.valueOf("rajwe"));
		System.out.println(studentname);
	}
	

}
