package com.gl.methodreferences;
import java.util.function.Function;

public class MethodReferenceStatic {

	    public static int stringLength(String str) {
	        return str.length();
	    }

	    public static void main(String[] args) {
	        
	        Function<String, Integer> referenceFunction = MethodReferenceStatic::stringLength;
	        String text = "Hello";
	        int length = referenceFunction.apply(text);
	        System.out.println("Length of \"" + text + "\": " + length);
	    }
	}



