package com.gl.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
	
	  public static void main(String args[]){
	    ArrayList<String> listOfCountries = new ArrayList<>();
	    listOfCountries.add("Karnataka");
	    listOfCountries.add("Andra Pradesh");
	    listOfCountries.add("Chennai");
	    listOfCountries.add("Arunachal Pradesh");

	    System.out.println("Before Sorting: "+ listOfCountries);
	    Collections.sort(listOfCountries);
	    System.out.println("After Sorting: "+ listOfCountries);
	  }
	}


