import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, String> phoneNumbers = new HashMap<>();
        
        System.out.println("Enter a name and number, or a name and ? to query (!! to exit)");
        while (in.hasNext()) {
            String line = in.nextLine();
            if (line.contains("!!") == false) {
                String[] tmpLine = line.split(" ");
                if (tmpLine[1].contains("?") == false) {
                    phoneNumbers.put(tmpLine[0], tmpLine[1]);
                } else if (tmpLine[1].contains("?")) {
                    if (phoneNumbers.containsKey(tmpLine[0])) {
                        System.out.println(tmpLine[0] + " has number " + phoneNumbers.get(tmpLine[0]));
                    } else {
                        System.out.println("Sorry, there is no " + tmpLine[0]);
                    }
                }
            } else {
                System.out.println("Bye");
                System.exit(0);
            }
        }
        in.close();
    }
}