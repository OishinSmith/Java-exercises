import java.util.Scanner;

public class ReducedString
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        int n = t.nextInt();
        String s = t.next();
        String sol = s.substring(0, n)+s.substring(n+1, s.length());
        System.out.println("Enter an integer and a string: "+sol);
    }
}