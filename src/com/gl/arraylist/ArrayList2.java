package com.gl.arraylist;

import java.util.ArrayList;

	public class ArrayList2 {
	    public static void main(String[] args) {
	    	
	        ArrayList<Integer> numbersWithDuplicates = new ArrayList<>();
	        numbersWithDuplicates.add(11);
	        numbersWithDuplicates.add(12);
	        numbersWithDuplicates.add(13);
	        numbersWithDuplicates.add(11);
	        numbersWithDuplicates.add(14);
	        numbersWithDuplicates.add(12);
	        numbersWithDuplicates.add(15);

	        System.out.println("ArrayList with duplicates: " + numbersWithDuplicates);

	        ArrayList<Integer> numbersWithoutDuplicates = removeDuplicates(numbersWithDuplicates);

	        System.out.println("ArrayList without duplicates: " + numbersWithoutDuplicates);
	    }

	    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> listWithDuplicates) {
	       
	    	int size = listWithDuplicates.size();
	        for (int i = 0; i < size; i++)
	        {
	            int currentElement = listWithDuplicates.get(i);
	            for (int j = i + 1; j < size; j++) 
	            {
	                if (listWithDuplicates.get(j).equals(currentElement)) 
	                {
	                    listWithDuplicates.remove(j);
	                    size--;
	                    j--;
	                }
	            }
	        }
			return listWithDuplicates;
	    }
	}
	    


