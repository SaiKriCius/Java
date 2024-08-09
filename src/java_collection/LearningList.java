package java_collection;
import java.util.List;

import java.util.ArrayList;

public class LearningList {
	public static void main(String[] args) {
		
		//creating a list called pawns
		List<Integer> pawns = new ArrayList<>();
		
		//adding values to the list pawns
		pawns.add(1);
		pawns.add(2);
		pawns.add(3);
		pawns.add(4);
		
		//printing the list pawns
		System.out.println(pawns);
		pawns.add(5);
		System.out.println(pawns);
		pawns.add(1,9);
		System.out.println(pawns);
		
		//creating a new list
		List<Integer> boose = new ArrayList<>();
		boose.add(60);
		boose.add(50);
		
		//adding all the elements of the new list to the old list
		pawns.addAll(boose);
		System.out.println(pawns);
		
		//getting an element at specific location
		System.out.println(pawns.get(5)+" got it");
		
		//removing a element from a specific location
		pawns.remove(6);
		System.out.println(pawns);
		
		//removing an element by choosing the element
		pawns.remove(Integer.valueOf(50));
		System.out.println(pawns);
		
		//updating a value in the list
		pawns.set(1, 7);
		System.out.println(pawns);
		
		//checking the value is in the list or not
		System.out.println(pawns.contains(5));
		
		//clearing list
		System.out.println(boose);
		boose.clear();
		System.out.println(boose);
		
		
		
		
	}
}
