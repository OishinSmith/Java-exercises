import java.util.Scanner;

public class InitialLess
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String name = t.next();
        int nameLength = name.length();
        String restOfName = name.substring(1, nameLength);
        System.out.println("Initialless, your name is " + restOfName + ".");    
    }
}