import java.util.Scanner;

public class Inches2cm
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner ancient = new Scanner(System.in);
        double inch = ancient.nextDouble();
        double cm = 2.54;
        double t = inch * cm;
        System.out.println((int) inch + " " + t);
    }
}