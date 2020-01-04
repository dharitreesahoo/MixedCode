package tests;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapBasedOnKeyUsingKey {
	 // This map stores unsorted values 
    static Map<String, String> map = new HashMap<>(); 
  
    // Function to sort map by Key 
    public static void sortbykey() 
    { 
        // TreeMap to store values of HashMap 
        TreeMap<String, String> sorted = new TreeMap<>(); 
         // Copy all data from hashMap into TreeMap 
        sorted.putAll(map); 
         // Display the TreeMap which is naturally sorted 
        for (Map.Entry<String, String> entry : sorted.entrySet())  
            System.out.println("Key = " + entry.getKey() +  
                         ", Value = " + entry.getValue());         
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map.put("item1", "one");
		map.put("item2", "two");
		map.put("item3", "three");
		map.put("item4", "four");
	  
	        // Calling the function to sortbyKey 
	        sortbykey();

	}

}
