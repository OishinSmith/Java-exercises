import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti1
{
    public static void main(String [] args) throws FileNotFoundException
    {
        File file = new File(args[1]);
        Scanner in = new Scanner(file);
        
        int count = 0;
        while(in.hasNext())
        {
            int rat = in.nextInt();
            String line = in.nextLine();
            
            if(line.contains(args[0]))
            {
                count = count + 1;
            }
            
            
        }
        System.out.println(args[0]+" appears "+ count+ " times.");
    }
}
        