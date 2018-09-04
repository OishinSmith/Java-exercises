import java.util.Scanner;

public class Absolute
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        System.out.println("The absolute value is " + Math.abs(number) + ".");
        
    
    }
}