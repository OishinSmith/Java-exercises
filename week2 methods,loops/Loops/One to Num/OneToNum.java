import java.util.Scanner;

public class OneToNum
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        
        int i = 1;
        while(i <= x)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); // Finish with a new line.
    }
}