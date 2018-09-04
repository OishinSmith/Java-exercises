import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Previous {
    public static void main(String[] args) {
        System.out.println("Enter some numbers (-1 to end)");
        
        Scanner in = new Scanner(System.in);
        Set<Integer> dups = new HashSet<Integer>();
        
        // This block of code deals with the user input. I add the input
        // to a string (tmp) separated by a comma (","). The logic behind
        // this is that you need the whole user input to find the duplicates,
        // but since I don't know the number of inputs I can't use an array.
        // tmp.split(",") will solve this problem. I will have all of the
        // input in an array. After this I will simply convert the strings
        // to ints. This final array will be called total.
        
        String tmp = "";
        int tmpCounter = 0;
        int x = 0;
        while (in.hasNext() & x != -1) {
            x = in.nextInt();
            if (tmpCounter == 0 & x != -1) {        // This if statement prevents
                tmp += Integer.toString(x);         // the addition of "," at the start.
            } else if (x != -1) {
                tmp += "," + Integer.toString(x);
            }
            tmpCounter = 1;                         // Setting the counter to 1 prevents
        }                                           // execution of the if statement.
        
        // Filling array total with ints.
        int[] total = new int[tmp.split(",").length];
        for (int i = 0; i < total.length; i++) {
            total[i] = Integer.parseInt(tmp.split(",")[i]);
        }
        
        // Printing the duplicates in order.
        System.out.println("Previous:");
        for (int i = 0; i < total.length; i++) {
            if (!dups.add(new Integer(total[i]))) {
                System.out.println(total[i]);
            }
        }
    }
}