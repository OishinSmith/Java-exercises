// You may assume that the input will be two integers and that they will not be equal.
import java.util.Scanner;

public class Bigger
{
  public static void main(String [] args)
  {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = in.nextInt();
      System.out.print("Enter two numbers: ");
      
      if (n > m)
      {
          System.out.println(n+" is the biggest.");
      }
      else
      {
      System.out.println(m+" is the biggest.");
      }
  }
}