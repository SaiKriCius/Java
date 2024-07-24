package java_collection;
import java.util.HashSet;
import java.util.Set;


public class Sudentset {
	public static void main(String[] args) {
		
		//Student class is made in a seperate java file
		Set<Student> stinfo = new HashSet<>(); 
		
		stinfo.add(new Student("raj",2));
		stinfo.add(new Student("arun",5));
		stinfo.add(new Student("varun",3));
		stinfo.add(new Student("tarun",8));
		stinfo.add(new Student("nakul",1));

		//these will not going to be added because these has the same roll no as the one of the student before them 
		stinfo.add(new Student("varun",3));
		stinfo.add(new Student("aryan",3));

		System.out.println(stinfo);
	
	
	}

}
