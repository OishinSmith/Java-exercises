import java.util.*;
public class Point implements Order
{
    private double x, y;
    
    public Point(double newX, double newY)
    {
        x = newX;
        y = newY;
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
    
    
    public boolean lessThan(Order other)
    {
        
        Point otherPoint = (Point) other;
        double powRootX = Math.pow((this.x),2);
        double powY = Math.pow((this.y), 2);
        
        double powRootOtherX = Math.pow((otherPoint.x), 2);
        double powOtherY = Math.pow((otherPoint.y), 2);
        
        if(Math.sqrt(powRootOtherX + powOtherY) > Math.sqrt(powRootX + powY))
        {
            return true;
        }
        if(Math.sqrt(powRootOtherX + powOtherY) < Math.sqrt(powRootX + powY))
        {
            return false;
        }
        return false;
    }
}