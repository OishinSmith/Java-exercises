import java.util.Scanner;

public class Test
{
    // Create a static void method called reverse which takes an array of ints
    public static int reverse(int [] args)
    {
        int [] revList = new int[args.length];
        for(int i = 0; i<args.length ; i++)
        {
            revList[i] = args[args.length-i-1];
            System.out.print(" " + revList[i]);
        }
        return 1;   //its reversing the string but not printing it.
        
    }
    
    
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int len = in.nextInt();
        
        int [] num = new int[len];
        System.out.print("Enter " + len + " numbers: ");
        for(int i = 0; i < num.length; i++)
            num[i] = in.nextInt();
            
        Test.reverse(num);
        System.out.println(num);
        System.out.print("The numbers reversed are:");
        for(int i = 0; i < num.length; i++)
            System.out.print(" " + num[i]);
            
        System.out.println();
    }
    
    
    
    
    
    
}