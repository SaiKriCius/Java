package java_collection;

import java.util.Objects;

public class Student implements Comparable<Student> {
	
	String name;
	int rollno;
	
	 public Student(String name,int rollno) {
		 this.name = name;
		 this.rollno = rollno; 
		 
		 
	 }

	 //this makes sure that the name and rollno is printing as what I have given in the Sudentset.java file
	//start here
	 @Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	//end here

	 
	 //this makes sure that students can have similar names but not the same roll no
	 //so if anyone will have same rollno it will discard one of them
	 // this also sorts them students according to thier rollno idk why 
	 //starts here
	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollno == other.rollno;
	}
	//end here

	@Override
	public int compareTo(Student that) {
		
		return this.rollno - that.rollno;
	}
	
	
}
