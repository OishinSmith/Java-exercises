public class Test
{
    // Create a static method called countEven which returns the number of even numbers in the array
    public static int countEven(int [] list)
    {
        int count = 0;
        for(int i = 0; i < list.length; i++)
        {
            if (list[i] % 2 == 0)
            {
                count = count + 1;
            }
        }
        return count;
    }
}