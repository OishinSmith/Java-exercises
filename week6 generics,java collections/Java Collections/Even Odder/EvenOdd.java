import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> odds = new ArrayList<Integer>();
        ArrayList<Integer> evens = new ArrayList<Integer>();
        
        int x = 0;
        while (in.hasNext() & x != -1) {
            x = in.nextInt();
            if (x == -1) {
                break;
            }
            else if (x % 2 != 0) {
                odds.add(x);
            } else {
                evens.add(x);
            }
        }
        
        System.out.print(" Odd: ");
        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i) + " ");
        }
        
        System.out.println();
        
        System.out.print("Even: ");
        for (int i = 0; i < evens.size(); i++) {
            System.out.print(evens.get(i) + " ");
        }
    }
}