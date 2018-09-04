import java.util.Scanner;

public class AboveAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        double sum = 0;
        // Create an array
        double [] list = new double[num];
        //
        
        System.out.print("Enter " + num + " numbers: ");

        // Now read in the numbers
        for(int i = 0; i < num; i++)
            {
                list[i] = in.nextDouble();
                sum = sum + list[i];
            }
        double avg = sum / num;
        
        
        // Print out the numbers greater than the average
        
        // You can use the following code to print out one number
        System.out.println("The above average numbers are:");
        for(int i = 0; i < num; i++)
        {
            //System.out.print(list[i]);
            if (list[i] > avg)
            {
                System.out.print(" " + list[i]);

                
            }
        }
        System.out.println(); // Should finish with a new line
        
    }
}