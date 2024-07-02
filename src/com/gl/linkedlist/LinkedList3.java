package com.gl.linkedlist;

import java.util.LinkedList;

public class LinkedList3 {
	
     public static void main(String[] args) {
	       
	        LinkedList<Integer> list = new LinkedList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        System.out.println("Middle element of the LinkedList: " + findMiddleElement(list));
	    }
	    
	    public static int findMiddleElement(LinkedList<Integer> list) {
	        int size = list.size();
	        int middleIndex = size / 2;
	        return list.get(middleIndex);
	    }
	}



