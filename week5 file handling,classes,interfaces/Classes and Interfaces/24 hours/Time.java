public class Time
{
   // Private variables
   private int minute;
   private int hour;
   
   public Time(String time)
   {
       hour = Integer.parseInt(time.substring(0,2));
       minute = Integer.parseInt(time.substring(2, 4));
   }
   
   public String toString()
   {
       if(10 > hour && 10 > minute)
       {
            return "0" + hour + ":" + "0" + minute;
       }
       else if(10 > minute && hour > 9)
       {
           return hour + ":" + "0" + minute;
       }
       else if(10 > hour && minute > 9)
       {
           return "0" + hour + ":" + minute;
       }
       return hour + ":" + minute;
   }
   
   public boolean isLater(Time time2)
   {
       if(time2.hour > hour)
       {
           return false;
       }
       if(time2.hour == hour && time2.minute > minute)
       {
           return false;
       }
       if(time2.hour == hour && time2.minute == minute)
       {
           return false;
       }
       return true;
   }
   // Constructor (with a String parameter)
   // isLater(Time otherTime) // boolean method to compare two times
   // String toString() // return a String representation of the time (hh:mm)
}