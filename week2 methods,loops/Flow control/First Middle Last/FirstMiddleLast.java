import java.util.Scanner;

public class FirstMiddleLast
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = in.next();
        
        System.out.println(word.substring(0, 1));
        System.out.println(word.substring(1, word.length()-1));
        System.out.println(word.substring(word.length()-1, word.length()));
    }
}