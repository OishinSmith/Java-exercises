import java.util.Scanner;

public class FirstThree
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String name = t.next().substring(0, 3);
        System.out.println("Your nickname is " + name + ".");
    
    }
}