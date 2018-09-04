import java.util.Scanner;

public class DoubleDivision
{
    public static void main(String[] arg)
        {
            Scanner div = new Scanner(System.in);
            System.out.print("Please enter two floating point numbers: ");
            double f = div.nextDouble();
            double s = div.nextDouble();
            double t = f/s;
            System.out.println(f + " / " + s + " is " + t);
        }  
}