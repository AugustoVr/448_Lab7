package lab7;

import java.util.Formatter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test {
	
		public static void main(String[] args){
			//Scanner scan = new Scanner(System.in);
			//out.formatln("Hello");
			//int size_args = args.length;
			
			//check command parameters
			/*if(size_args < 2 || size_args > 2){
				out.formatln("Error - Expected usage: java name_of_class input.txt output.txt");
			}*/
			
			//file streams
			
			String input = args[0];
			String output = args[1];
			
			//String input = "C:/Users/Jhoel/workspace/lab7_eecs448/input.txt";
			//String output = "C:/Users/Jhoel/workspace/lab7_eecs448/src/lab7/output.txt";
			
			String newLine = System.getProperty("line.separator");
			
			try{
			Scanner x = new Scanner(new File(input));
			//while(x.hasNext()){
			//	out.format(x.next());
			//}
			//x.close();
			
			//open and read input.txt 
			//File file = new File(input);
			//file.createNewFile();
			
			//FileWriter out = new FileWriter(output);
			Formatter out = new Formatter(output);
			//FileReader fr = new FileReader(file);
			
			//read first line of file
			//int size = fr.read();
			
			//out.formatln(size);
			//read line by line
			int size = Integer.parseInt(x.next());
			
			while(size > 0){
	             //out.formatln(line);
				 matrix m = new matrix(size);
				 
				 /*int num = Integer.parseInt(x.next());
				 out.format(num);*/
				 //out.write("M = " + newLine);
				 out.format("M =" +newLine);
				 for(int i=0;i<size;i++){
					 for(int j=0;j<size;j++){
						 m.mdata[i][j] = Integer.parseInt(x.next());
						 //out.write(m.mdata[i][j] + newLine);
						 out.format(m.mdata[i][j] + " ");
					 }
					 out.format(newLine);
				 }
				 //int num = fr.read();	 

				 
				 double det = m.determinant();
				 //out.write("det(M) = " + det + newLine + newLine);
				 out.format("det(M) = " + det + newLine + newLine);

				 if(!(det == 0)){
					 matrix inv = m.inverse();
					 //out.write("Minv = " + newLine + inv + newLine);
					 out.format("Minv = " + newLine);
					 for(int i=0;i<size;i++){
						 for(int j=0;j<size;j++){
							 out.format(inv.mdata[i][j] + " ");
						 }
						 out.format(newLine);
					 }//end for loop
				 }
				 
				 size = Integer.parseInt(x.next());
				 //out.format("next is" + size);
				 
			 }
				 
				 
	                
	         //end while 
			 
			 
			 //fr.close();
			 out.close();
			 x.close();

			}
			
			//detect exceptions
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
		
}
}
