package com.gl.nestedtrycatchblock;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the file path: ");
	        String filePath = scanner.nextLine();

	        try {
	            BufferedReader reader = new BufferedReader(new FileReader(filePath));
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	            reader.close();

	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + filePath);
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    } 

}



