package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SortAMap {
	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("item1", "one");
		map1.put("item2", "two");
		map1.put("item3", "three");
		map1.put("item4", "four");

		Set<Entry<String, String>> set = map1.entrySet();
		List<Entry<String, String>> lst = new ArrayList<Entry<String, String>>(set);

		Collections.sort(lst, new Comparator<Entry<String, String>>() {
			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return o1.getValue().compareTo(o1.getValue());
			}

		});

		// Create a new Map to store values after sorting
		Map<String, String> sortedMap = new LinkedHashMap<String, String>();
		for (Entry<String, String> entry : lst) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		
		// Display sorted map
		Set<Entry<String, String>> sortedSet = sortedMap.entrySet();
		for (Entry<String, String> entry : sortedSet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
