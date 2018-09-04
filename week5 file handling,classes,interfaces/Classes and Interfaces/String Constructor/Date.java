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
}