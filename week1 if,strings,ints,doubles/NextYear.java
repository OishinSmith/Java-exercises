import java.util.Scanner;

public class NextYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = sc.next();
        System.out.print("What age are you: ");
        int age = sc.nextInt();
        int older = age + 1;
        System.out.println("Hello " + name + ", next year you will be " + older + ".");
    }
}