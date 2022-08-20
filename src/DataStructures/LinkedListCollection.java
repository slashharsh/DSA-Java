package DataStructures;

import java.util.*;

public class LinkedListCollection {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		// Insert
		ll.addFirst("this");
		ll.addLast("is"); // 'add' also works in last
		ll.forEach(s -> System.out.print(s + "->"));
		System.out.println("null");
		
		// Size
		System.out.println(ll.size());
		
		// Get Elements
		System.out.println(ll.get(0)); // for individual element.
		
		// Search for element
		// Same as below can be done for integer, also using for loop and comparisons.
		for(String x: ll) {
			if(x.equals("this")) {
				System.out.println("True");
			}
		}
		
		// Delete ELements
		ll.add("linked list");
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

	}

}
