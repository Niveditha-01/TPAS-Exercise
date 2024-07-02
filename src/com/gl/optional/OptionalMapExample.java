package com.gl.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalMapExample {
	    public static void main(String[] args) {
	        
	        Map<String, String> map = new HashMap<>();
	        map.put("key1", "value1");
	        map.put("key2", "value2");
	        String key = "key3";
	        Optional<String> optionalValue = Optional.ofNullable(map.get(key));

	        if (optionalValue.isPresent()) 
	        {
	            System.out.println("Value for key '" + key + "': " + optionalValue.get());
	        } 
	        else 
	        {
	            System.out.println("No value found for key '" + key + "'.");
	        }
	    }
	}



