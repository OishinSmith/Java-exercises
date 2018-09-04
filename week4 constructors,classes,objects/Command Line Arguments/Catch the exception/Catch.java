public class Catch {
    
    public static void main(String [] args) {
        
        Broken broke = new Broken();
        
        try {
            System.out.println("Testing");
            broke.cracked();
        } catch (ArrayIndexOutOfBoundsException caught) {
            System.out.println("Caught the exception.");
        }
    }
}