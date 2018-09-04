import java.util.*;

public class ListSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<Integer>();
        
        int x = 0;
        while (in.hasNext() & x != -1) {
            x = in.nextInt();
            if (x == -1) {
                break;
            } else {
                lst.add(x);
            }
        }
        Collections.sort(lst);
        
        System.out.print("Sorted: ");
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i) + " ");
        }
    }
}