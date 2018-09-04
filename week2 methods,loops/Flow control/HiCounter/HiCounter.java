/*
    This code is supplied and may be used to solve this problem.
    
    Note that the output matching is exact (down to spaces and newlines)
    It will be very difficult to get this correct if you do not use the supplied 
    System.out.print statements
*/
import java.util.Scanner;

public class HiCounter
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a phrase: ");

        String word = in.next();
        String hi = "hi";
        int counter = 0;
        
        for (int i = 0; i < word.length()-1; i++)
        {
            
            if (hi.equals(word.substring(i, i+2)))
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
}