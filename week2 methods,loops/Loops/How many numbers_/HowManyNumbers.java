import java.util.Scanner;

public class HowManyNumbers
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        
        int n = in.nextInt();
        int counter = 0;
        
        for (counter = 0; n != -1; counter++)
        {
            n = in.nextInt();
        }
        System.out.println();
        System.out.println(counter + " numbers were entered.");
    }
}