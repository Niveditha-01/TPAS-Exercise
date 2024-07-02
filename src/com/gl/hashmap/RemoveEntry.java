package com.gl.hashmap;

import java.util.HashMap;

public class RemoveEntry {
	
	    public static void main(String[] args) {
	        
	        HashMap<String, Integer> map = new HashMap<>();
	        map.put("Chintu", 24);
	        map.put("Vacha", 19);
	        map.put("Sankalp", 54);
	        map.put("Neha", 40);
	        System.out.println("HashMap before removal: " + map);
	        
	        removeEntry(map, "Chintu");
	        
	        System.out.println("HashMap after removal: " + map);
	    }
	    
	    public static void removeEntry(HashMap<String, Integer> map, String key) {
	        
	        if (map.containsKey(key)) 
	        {  
	            map.remove(key);
	            System.out.println("Entry with key '" + key + "' removed successfully.");
	        } 
	        else 
	        {
	            System.out.println("Key '" + key + "' does not exist in the HashMap.");
	        }
	    }
	}



