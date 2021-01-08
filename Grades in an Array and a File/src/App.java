import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		try {
			 int grades[] = new int[5];
			 
			 System.out.println("What is your name (first and last)?");
			 String fname = s.nextLine();
			 String lname = s.nextLine();
			 
			 System.out.println("Enter the file name: ");
			 String fileName = s.nextLine();
			 
			 PrintWriter writer = new PrintWriter(fileName, "UTF-8");
			 writer.println(fname + " " + lname);
			 
			 System.out.println("Here are your randomly selected grades: (hope you pass)");
			 
			 for(int i = 0; i < grades.length; i++) {
				 grades[i]=1+r.nextInt(100);
				 writer.print(grades[i] + " ");
				 System.out.println("Grade " + (i+1) + ": " + grades[i]);
			 }
			 writer.close();
	         System.out.println("File created successfully");
	      }
	      catch (IOException e) {
	    	  e.printStackTrace();
	    	  System.out.println("File writing did not work.");
	      }
		 s.close();
	}
}
