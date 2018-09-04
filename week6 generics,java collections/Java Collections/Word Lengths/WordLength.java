import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class WordLength
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> words = new HashMap<Integer, Integer>();
        String[] splits = {};
        
        while (in.hasNext())
        {
            String line = in.nextLine();
            splits = line.split("\\s+");
            
            int max = 0;
            for(int i = 0; i <splits.length; i++)
            {
                if(words.containsKey(splits[i].length())) //if 4 exists
                {
                    int counter = words.get(splits[i].length());
                    words.put(splits[i].length(), counter + 1);
                }
                else
                {
                    words.put(splits[i].length(), 1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()); 
        }
    }
}