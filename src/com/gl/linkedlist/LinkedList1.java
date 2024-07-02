package com.gl.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	
	    public static void main(String[] args) {
	      
	        LinkedList<Integer> linkedList = new LinkedList<>();
	        linkedList.add(1);
	        linkedList.add(2);
	        linkedList.add(3);
	        linkedList.add(4);
	        linkedList.add(5);

	        System.out.println("Elements of the LinkedList:");
	        Iterator<Integer> iterator = linkedList.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


