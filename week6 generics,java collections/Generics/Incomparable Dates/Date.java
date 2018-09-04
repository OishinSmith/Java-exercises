// Make the Date class implement the comparable interface
public class Date implements Comparable<Date>
{
   private int day, month, year;

   public Date(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public String toString()
   {
      return day + "/" + month + "/" + year;
   }
   
   public int compareTo(Date date)
   {
       if(date.year == year)
       {
           if(date.month == month)
           {
               if(day == date.day)
               {
                   return 0;
               }
               else if(day > date.day)
               {
                   return 1;
               }
               return -1;
           }
           else if(month > date.month)
           {
               return 1;
           }
           else
           {
               return -1;
           }
       }
       else if(year > date.year)
       {
           return 1;
       }
       
       return -1;
   }
}