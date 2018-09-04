import java.util.Scanner;

public class Initial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        char firstLetter = name.charAt(0);
        System.out.println(name + " starts with the letter " + firstLetter + ".");
    }
}