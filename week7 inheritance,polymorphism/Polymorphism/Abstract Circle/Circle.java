public class Circle extends Shape
{
    private double radius; //name inherited, so no need to define
    
    public Circle(String name, double r)
    {
        super(name);
        radius = r;
    }
    
    double area()
    {
        return Math.PI*(radius*radius);
    }
    
    
}