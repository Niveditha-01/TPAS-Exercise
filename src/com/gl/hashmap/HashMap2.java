package com.gl.hashmap;

import java.util.HashMap;

public class HashMap2 {
	
	    public static void main(String[] args) {
	       
	        HashMap<String, Integer> hashMap = new HashMap<>();
	        
	        hashMap.put("Rose", 120);
	        hashMap.put("Lily", 230);
	        hashMap.put("Marigold", 130);

	        String keyToCheck = "Lily";

	        if (hashMap.containsKey(keyToCheck)) {
	            System.out.println("Key '" + keyToCheck + "' exists in the HashMap.");
	        } else {
	            System.out.println("Key '" + keyToCheck + "' does not exist in the HashMap.");
	        }
	    }
	}



