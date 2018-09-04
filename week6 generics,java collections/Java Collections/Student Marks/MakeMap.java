import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
 
public class MakeMap
{
    public static Map<String,Integer> makeMap(Scanner args)
    {
      
      Map<String, Integer> grades = new HashMap<String, Integer>();
      String x;
      while(args.hasNext())
        {
            x = args.nextLine();
            //System.out.print(x);
            String[] splits = x.split("\\s+");
            String name = splits[0];
            int number = Integer.parseInt(splits[1]);
            //System.out.print(splits[0]);
            
            grades.put(name, number);
        }
      return grades;
    }
}