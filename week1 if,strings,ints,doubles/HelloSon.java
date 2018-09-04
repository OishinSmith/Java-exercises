import java.util.Scanner;

public class HelloSon
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        
        System.out.println("Tell me your name: " + "Hello " + name);
    }
}