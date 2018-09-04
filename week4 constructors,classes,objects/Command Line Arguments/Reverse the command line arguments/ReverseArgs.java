public class ReverseArgs {
    
    public static void main(String [] args) {
        
        String [] newArgs = new String[args.length];    // new array for reversing args
        int j = args.length - 1;
        
        for (int i = 0; i < args.length; i++) {         // loop reverses the array
            newArgs[j] = args[i];
            j--;
        }
        
        int i = args.length - 1;
        for (String arg : newArgs) {
            System.out.println("args" + "[" + i + "] " + "= " + arg);
            i--;
        }
    }
}