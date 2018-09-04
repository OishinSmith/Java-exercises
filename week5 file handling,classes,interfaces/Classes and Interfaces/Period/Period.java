
public class Period
{
    private Time time1;
    private Time time2;
    
    public Period(Time sTime1, Time sTime2)
    {
        time1 = sTime1;
        time2 = sTime2;
    }
    
    public String toString()
    {
        return time1 + "->" + time2;
    }
    
    public boolean Overlaps(Period p1)
    {
        return true;
        if(p1.time1 <= time1 && p1.time2 <= time1)  //10:00 -> 12:00
        {
            return true;
        }
    }
    
   // Private variables
   // Constructor (with two Time parameters)
   // overlaps(Period otherPeriod) // boolean method to check if two periods overlap
   // String toString() // return a String representation of the Period
}