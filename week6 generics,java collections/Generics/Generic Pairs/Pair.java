public class Pair<T1, T2>
{
    private T1 name;
    private T2 number;
    
    public Pair(T1 name, T2 number)
    {
        this.name = name;
        this.number = number;
    }
    
    public String toString()
    {
        return "" + name + " " + number;
    }
}