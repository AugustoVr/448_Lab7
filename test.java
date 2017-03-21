package lab7;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test {
	
		public static void main(String[] args){
			//Scanner scan = new Scanner(System.in);
			//System.out.println("Hello");
			int size_args = args.length;
			
			//check command parameters
			if(size_args < 2 || size_args > 2){
				System.out.println("Error - Expected usage: java name_of_class input.txt output.txt");
			}
			
			//file streams
			String input = args[0];
			String output = args[1];
			
			//open and read input.txt 
			String line = "";
			try{
			FileReader file = new FileReader(input);
			BufferedReader buff = new BufferedReader(file);
			
				//read line by line
			 	while((line = buff.readLine()) != null) {
	                System.out.println(line);
	            } 
			 
			 buff.close();
			}
			
			//detect exceptions
			catch(IOException e){
				System.out.println(e.getMessage());
			}
			
		}
}
