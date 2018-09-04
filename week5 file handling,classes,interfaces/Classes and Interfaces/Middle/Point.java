public class Point
{
   private double x;
   private double y;

   public Point(double newX, double newY)
   {
      x = newX;
      y = newY;
   }

   public String toString()
   {
      return "(" + x + ", " + y + ")";
   }
   
   public Point midPoint(Point points)
   {
       double pointX = ((points.x + x) / 2);
       double pointY = ((points.y + y) / 2);
       Point pointXY = new Point(pointX, pointY);
       return pointXY;
       
   }
}