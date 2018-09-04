import java.util.Scanner;
import java.io.File;
public class ReadNames
{
    public static void main(String [] args) //exception has to be added thanks to fileNOtFound error
    {
        try
        {
        System.out.print("Enter the file name: ");
        Scanner in = new Scanner(System.in);
        File file = new File(in.nextLine().substring(1));
        in = new Scanner(file);
        String names;
        String allNames = "";
        while(in.hasNextLine())
        {
            names = in.nextLine();
            allNames = allNames + names + " ";
        }
        String [] allNames1 = allNames.split(" ");
        System.out.println("The names in reverse order are:");
        for(int i = allNames1.length - 1; i >= 1; i--)
        {
            System.out.print(allNames1[i] + " ");
        }
        
        }catch(Exception e){e.printStackTrace();} //to find error in code
    }
}