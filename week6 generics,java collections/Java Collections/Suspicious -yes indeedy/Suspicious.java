import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.io.File;
import java.io.FileNotFoundException;

public class Suspicious {
    public static void main(String[] args) {
        File fileOne = new File(args[0]);
        File fileTwo = new File(args[1]);
        
        Set<String> dups = new HashSet<String>();
        String tmp = "";
        
        try {
            Scanner in = new Scanner(fileOne);
            while (in.hasNext()) {
                String line = in.nextLine();
                if (tmp.isEmpty()) {
                    tmp = line;
                } else {
                    tmp += "," + line;
                }
            }
            String[] students = tmp.split(",");
            in.close();

            in = new Scanner(fileTwo);
            tmp = "";
            while (in.hasNext()) {
                String line = in.nextLine();
                if (tmp.isEmpty()) {
                    tmp = line;
                } else {
                    tmp += "," + line;
                }
            }
            String[] delinquents = tmp.split(",");
            
            int smallestArray;
            if (students.length > delinquents.length) {
                smallestArray = delinquents.length;
            } else {
                smallestArray = students.length;
            }

            for (int i = 0; i <students.length; i++) {
                dups.add(new String(students[i]));
            }
            
            int counter = 1;
            for (int i = 0; i < smallestArray; i++) {
                if (!dups.add(new String(delinquents[i]))) {
                    System.out.println(counter + ". " + delinquents[i]);
                    counter++;
                }
            }
            in.close();
        } catch (FileNotFoundException exc) {
            System.out.println(fileOne.getAbsolutePath());
        }
    }
}