// Modify this class so that it implements the Order interface
import java.util.Scanner;
public class Cat implements Order
{
    private String name;
    
    public Cat(String n)
    {
        name = n;
        name = name.trim();
    }
    
    public String toString()
    {
        return "Cat: " + name;
    }
    
    private static void swap(Order [] items, int a, int b)
    {
        Order tmp;
        tmp = items[a];
        items[a] = items[b];
        items[b] = tmp;
    }
    
    public boolean lessThan(Order other)
    {
        
        Cat otherCat = (Cat) other;
        if(otherCat.name.length() > name.length())
            {
                return true;
            }
        return false;
    }
    
     public static void sort(Order [] items)
    {
        // Use selection sort.
        for(int i = 0; i < items.length - 1; i++)
        {
            // Find the smallest and put it in the current position
            int min = i; // Assume it's the first
            for(int j = i + 1; j < items.length; j++)
                if(items[j].lessThan(items[min]))
                    min = j; // something is lessThan our current min ... update
                    
            swap(items, i, min); // Put the smallest in the correct location
        }
    }
    
    public static Cat getCat(Scanner in)
    {
        String name = in.nextLine();
        return new Cat(name);
    }
}