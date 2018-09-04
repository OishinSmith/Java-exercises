import java.util.Scanner;

public class LastLetter
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = t.next();
        char lastLetter = name.charAt(name.length()-1);
        System.out.println("The last letter of your name is " + lastLetter + ".");
        
    }
}