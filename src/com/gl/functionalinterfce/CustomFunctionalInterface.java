package com.gl.functionalinterfce;
@FunctionalInterface
interface MathOperation {
int operate(int a, int b);
	}

	public class CustomFunctionalInterface {
	    public static void main(String[] args) {
	        MathOperation addition = (a, b) -> a + b;
	        System.out.println("Addition: " + performOperation(addition, 5, 3));

	        MathOperation subtraction = (a, b) -> a - b;
	        System.out.println("Subtraction: " + performOperation(subtraction, 5, 3));

	        MathOperation multiplication = (a, b) -> a * b;
	        System.out.println("Multiplication: " + performOperation(multiplication, 5, 3));

	        MathOperation division = (a, b) -> a / b;
	        System.out.println("Division: " + performOperation(division, 6, 3));
	    }

	    private static int performOperation(MathOperation operation, int a, int b) {
	        return operation.operate(a, b);
	    }
	}



