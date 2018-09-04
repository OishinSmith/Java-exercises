import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Senti2 
{ 
  public static void main(String [] args) throws FileNotFoundException   
    { File file = new File(args[1]);
      Scanner in = new Scanner(file);
      int sums = 0;
      int counter = 0;
      while (in.hasNext()) 
      { 
        int rate = in.nextInt();
        String line = in.nextLine(); 
        if (line.contains(args[0])) 
          {
            counter = counter + 1;
            sums = sums + rate; 
          } 
      } 
      
      
      double sumFloat = (sums * 1.0) / counter;
      System.out.println(args[0] + " appears " + counter + " times.");
      
      if (sums != 0 && sums > 0) 
        {
          System.out.println("The average score of the reviews containing " + args[0] + " is " + String.format("%.2f", sumFloat)); 
        }
      else 
        { System.out.println("The average score of the reviews containing " + args[0] + " is 0.00"); 
      } 
   }
}