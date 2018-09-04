public class Average
{
    public static double averageArea(Shape [] args)
    {
        double total = 0.0;
        double averageArea = 0.0;
        for(int i = 0; i < args.length; i++)
        {
            double area = Double.parseDouble(args[i]);
            total = total + area;
        }
        
        averageArea = total / args.length;
        return averageArea;
    }
}