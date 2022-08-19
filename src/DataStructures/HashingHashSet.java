package dsa;

import java.util.HashSet;
import java.util.Iterator;

public class HashingHashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
