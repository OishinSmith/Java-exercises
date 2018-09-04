import java.util.Scanner;
public class Date
{
    private int day;
    private int month;
    private int year;
    
    public Date(String d)
    {
        String [] splitS = d.split(" ");
        day = Integer.parseInt(splitS[0].trim());
        month = Integer.parseInt(splitS[1].trim());
        year = Integer.parseInt(splitS[2].trim());
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    
    public boolean isOnOrAfter(Date day2)
    {   
        if(year == day2.year & month == day2.month & day == day2.day)
        {
            return true;
        }
        else if(year > day2.year)
        {
            return true;
        }
        else if (month > day2.month)
        {
            return true;
        }
        else if(day > day2.day)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    // Here is the main method which will read in a sequence of dates.
    // Modify it so that it prints the latest date.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        String line;
        int maxD = 0;
        int maxM = 0;
        int maxY = 0;
        String maxDate = "";
        //Date maxDate1 = new Date("00 00 0000");
        while(in.hasNext())
        {
           line = in.nextLine().trim();
           Date date = new Date(line);
           if(date.year > maxY)
           {
                maxDate = line;
                maxY = date.year; 
           }
           else if(date.year == maxY)
           {
               if(date.month > maxM)
               {
                   maxDate = line;
                   maxM = date.month;
                   maxD = date.day;
               }
               else if(date.month == maxM)
               {
                   if(date.day > maxD)
                   {
                       maxDate = line;
                       maxD = date.day;
                   }
               }
           }
             

        }
        Date date1 = new Date(maxDate.trim());
        System.out.println(date1.toString()); // Print the latest date
    }
}