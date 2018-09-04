import java.util.Scanner;

public class Cent2Fahr
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextInt();
        float t = ((n * 9)/5) + 32;
        System.out.print((int) n + " " + t);

    }
}