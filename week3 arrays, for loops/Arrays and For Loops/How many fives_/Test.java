public class Test
{
    // Create a static method called countFives which returns the number of fives in the array
    public static int countFives(int [] num)
    {
        int count = 0;
        for(int i = 0; i < num.length; i++)
        {
            if(num[i] == 5)
            {
                count = count + 1;
            }
        }
        return count;
    }
}