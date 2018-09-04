// This class should contain a single method called max.

public class Test implements Order
{
    int value;
     public boolean greaterThan(Order other)
   {
      // Convert the other to a thing so I can compare values
      return value > ((Thing) other).value;
   }
   
   static <T> Order max(Order i, Order j)
   {
       
       if(i.greaterThan(j))
       {
           return i;
       }
       return j;
   }
   
 ///public interface Order
//{
    //	public boolean greaterThan(Order other);
// }
  

}