import java.util.Scanner;

public class NumToTwenty
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = in.nextInt();
        
        int i = x;
        while(i <= 20)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); // Finish with a new line.
    }
}