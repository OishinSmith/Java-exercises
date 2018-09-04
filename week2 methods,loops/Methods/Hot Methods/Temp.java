/*
    Create a class with a main method.
    The method should read in a Fahrenhit Temperature
    Get the equivalent in Celsius (using the fahr2cels() method
    and print out the result.
*/
import java.util.Scanner;

public class Temp
{
    static class Convert
    {
        public static double fahr2cels(double n)
        {
            return (n-32) * 5/9;
        }
    }
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Give me a Fahrenheit temperature: ");
        
        double f = in.nextDouble();
        double temp = Convert.fahr2cels(f);
        
        System.out.println("In Celsius that would be: " + temp);
    }
}