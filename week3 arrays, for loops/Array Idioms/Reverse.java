import java.util.Scanner;

public class Reverse
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int listSize = in.nextInt();
        int [] list = new int[listSize]; 
        // Read in the numbers
        System.out.print("How many numbers: ");
        
        for(int i = 0; i < listSize; i++)
        {
            list[i] = in.nextInt();
        }
        
        System.out.print("Enter "+listSize+" numbers: ");
        // reverse the numbers
        System.out.print("The numbers reversed are:");
        
        for(int i=listSize-1; i >= 0; i--)
        {
            System.out.print(" " + list[i]);
        }
        
        System.out.println();
        // print them out
        
        // Use System.out.print(" " + num[i]); and finish with a newline.
    }
}