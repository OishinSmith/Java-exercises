import java.util.Scanner;

public class SumNumber
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++)
        {
            sum = sum + i;
        }
        
        System.out.println("The sum of the numbers from 1 to " + n  + " is " + sum);
    }
}