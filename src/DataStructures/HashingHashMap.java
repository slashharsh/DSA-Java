package DataStructures;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashingHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		// Insertion
		map.put("India", 120);
		map.put("China", 130);
		map.put("USA", 110);

		System.out.println(map);
		map.put("China", 180);
//		System.out.println(map.get("China"));

		// Search
		if (map.containsKey("India")) {
			System.out.println("Exists");
		} else {
			System.out.println("Doesn't Exists");
		}

		//
		System.out.println(map.get("Indonesia")); // Null

//		Iterator it = map.iterator(); // doesnot work for hashmap

		// Iteration in map is done using EntrySet
		for (Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		// For getting all keys.
		Set<String> keysOfHashMap = map.keySet();
		for (String key : keysOfHashMap) {
			System.out.println(key);
		}

		// Remove:
		map.remove("China");

	}

}
