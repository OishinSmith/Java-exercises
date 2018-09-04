public class Test
{
    // Create a static method called getSum which sums an array of ints
    public static int getSum(int [] list)
    {
        int sum = 0;
        for(int i = 0; i < list.length; i++)
        {
            sum = list[i] + sum;
        }
        return(sum);
    }
    
    public static void main(String [] args)
    {
        int[] list1 = {1,2,3}; 
        System.out.print(getSum(list1));
    }
}