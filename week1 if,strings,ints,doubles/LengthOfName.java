import java.util.Scanner;

public class LengthOfName
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello " + name + ", your name has " + name.length() + " letters.");
        
    }
}