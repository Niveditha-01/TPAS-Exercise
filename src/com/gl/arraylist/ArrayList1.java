package com.gl.arraylist;
import java.util.ArrayList;

public class ArrayList1 {
	  public static void main(String[] args) {
	        ArrayList<String> stringList = new ArrayList<>();
	        
	        stringList.add("1");
	        stringList.add("2");
	        stringList.add("3");
	        stringList.add("4");
	        
	        System.out.println("Elements of the ArrayList:");
	        for (String str : stringList) {
	            System.out.println(str);
	        }
	    }
	}


