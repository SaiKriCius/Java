package java_collection;
import java.util.ArrayList;
import java.util.Iterator;
public class Iteratorssss {

	public static void main(String[] args) {

		ArrayList<Integer> multen = new ArrayList<>();

        multen.add(10);
        multen.add(20);
        multen.add(30);
        multen.add(40);
        multen.add(50);
        multen.add(60);
        multen.add(70);
        multen.add(80);
        multen.add(90);
        
        System.out.println(multen);
        
        //printing using for loop
        for (int i = 0; i < multen.size(); i++) {
//        	System.out.println("the element is " + multen.get(i));
			
		}
        
        //printing using for each loop
        for(Integer i:multen) {
        	System.out.println("it is " + i);
        }
        
        //now by using iterators
        Iterator<Integer> it= multen.iterator();
        
        while(it.hasNext()) {
        	System.out.println("iterator "+ it.next());
        }
        
        
        
        

	}

}
