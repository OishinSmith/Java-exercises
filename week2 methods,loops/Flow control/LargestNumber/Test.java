import java.util.Arrays;

public class Test
{
    public static int largest(int a, int b, int c)
    {
        // Write the code to find the largest of these three numbers
        // You will need a return statement to return the largest number
        
        int[] array;
        array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        
        Arrays.sort(array);
        
        return array[2];
    }
}