import java.util.Scanner;
 import java.io.File; 
import java.io.FileNotFoundException; 
public class GroupStudents 
{ 
	public static void main(String[] args) 
		{ 
			try 
			{ 
                                File file = new File(args[0]); 
				Scanner in = new Scanner(file); 
				Student[] allStud = new Student[Integer.parseInt(in.nextLine())];
				String line;
 				for (int i=0;i < allStud.length;i++) 
				{ 
					line = in.nextLine();
					String word = "";
 					allStud[i] = new Student(line.split(" ")[0], Integer.parseInt(line.split(" ")[1]));
 					//from the student class, you then have to print using Student.print
 				}
				Student.print(allStud); 
			} catch (FileNotFoundException e) {System.out.print("error");}
 
		}
}