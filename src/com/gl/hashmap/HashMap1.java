package com.gl.hashmap;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("Chintu", 24);
        map.put("Vacha", 19);
        map.put("Sankalp", 54);
        map.put("Neha", 40);
        
        System.out.println("HashMap entries:");
        for (String name : map.keySet()) {
            int age = map.get(name);
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
}



