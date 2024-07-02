package com.gl.java;

import java.util.Comparator;
import java.util.function.BiConsumer;

public class LambdaComparator {

	    public static void main(String[] args) {
	        BiConsumer<Integer, Integer> biConsumer = (a, b) ->System.out.println(a+b);
	        biConsumer.accept(10, 5);
	        
	        Comparator<String> c= (s1,s2) ->s1.compareTo(s2);
	    }
	}


