import java.util.Scanner;
import java.io.*;
public class WriteStudents 
{ 
	public static void main(String[] args) 
	{ 
	    File file = new File(args[0]); 
	    try
	    {
	        
	        
		Scanner in = new Scanner(file);
		int inte = Integer.parseInt(in.nextLine());
 
		String[] allStud = new String[inte];
 
		for (int i = 0; i < allStud.length; i++) 
		{ 
			String line = in.nextLine(); 
			int mark = Integer.parseInt(line.split(" ")[1]) + 1; //dunno why +1 
			allStud[i] = new String(line.split(" ")[0] + " " + mark); //student class
		}
		
		PrintWriter p = new PrintWriter(new FileWriter(args[1])); //class PrinterWriter
		
		p.write(Integer.toString(inte) + System.lineSeparator()); //charlie says it works like /n
		
		for(int i = 0; i < allStud.length; i++) 
		{ 
			if (i == allStud.length - 1) 
			{ 
				p.write(allStud[i]); 
			}
			else 
			{ 
				p.write(allStud[i] + System.lineSeparator()); 
			} 
		} 
		p.close();
	    }
		catch(FileNotFoundException e) {}
		catch(IOException e) {};
	
	}
}
