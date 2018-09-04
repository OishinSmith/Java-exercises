import java.util.Scanner;

public class NoMinusOne
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        
        int n = in.nextInt();
        int last = n;
        
        while (n != -1)
        {
            if (n != -1)
            {
                last = n;
            }
            n = in.nextInt();
        }
        System.out.println();
        System.out.println("The penultimate number was: " + last);
    }
}