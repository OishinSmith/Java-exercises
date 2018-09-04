public class Date
{

    private int day;
    private int month;
    private int year;
    
    public Date(String d)
    {
        String [] splitS = d.split(" ");
        day = Integer.parseInt(splitS[0]);
        month = Integer.parseInt(splitS[1]);
        year = Integer.parseInt(splitS[2]);
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
    
    // Create a boolean method which will check to sae that the date is on or after the date that is passed as a parameter.
}