package com.gl.defaultmethods;
interface Printable {
 default void print() {
     System.out.println("Printing from Printable interface");
 }
}

interface Displayable {
 default void display() {
     System.out.println("Displaying from Displayable interface");
 }
}

class MyClass implements Printable, Displayable {
 @Override
 public void print() {
     System.out.println("Custom print implementation");
 }
}

public class MultipleInheritance {
 public static void main(String[] args) {
     MyClass obj = new MyClass();
     obj.print();
     obj.display();
 }
}


