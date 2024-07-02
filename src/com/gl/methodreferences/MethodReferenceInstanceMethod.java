package com.gl.methodreferences;
import java.util.function.Function;
		class StringUtils {
	    public String toUpperCase(String str) {
	        return str.toUpperCase();
	    }
	}

	public class MethodReferenceInstanceMethod {
	    public static void main(String[] args) {
	        StringUtils stringUtils = new StringUtils();
	        Function<String, String> referenceFunction = stringUtils::toUpperCase;
	        String text = "hello";
	        String result = referenceFunction.apply(text);
	        System.out.println("Uppercase of \"" + text + "\": " + result);
	    }
	}


